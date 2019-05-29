package com.qtwy.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.qtwy.entity.Message;
import com.qtwy.entity.User;
import com.qtwy.service.IUserService;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

//import com.qtwy.util.EncodingTool;



@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	public IUserService userService;

	// 查询所有用户
	@RequestMapping("findAllUser")
	public String findAllUser(Model model) {
		List<User> userList = userService.findAll();
		model.addAttribute("userList", userList);
		return "/user/listUser";
	}
	

	@RequestMapping("showResume")
	public String showResume(Model model,HttpServletRequest request) {
		//获得session中存的当前对象
		User currUser = (User) request.getSession().getAttribute("currUser");
		String realname=currUser.getRealname();
		//根据真实姓名查询用户
		User user = userService.findUserByRealname(realname);
		model.addAttribute("user", user);
		return "/user/showUserResume";
	}
	/**
	 * 修改简历
	 * */
	@RequestMapping("editResume")
	public String editResume(Model model,Integer uid) {
		User user = userService.findById(uid);
		if(user!=null){
			model.addAttribute("user", user);
		}
		return "/user/editResume";
	}
	/**
	 * 保存简历
	 * */
	@RequestMapping("saveResume")
	public String saveResume(Model model,User user) {
		userService.saveResume(user);
		model.addAttribute("user", user);
		return "forward:showResume";//转发到预览简历
	}
	
	
	// 跳转到修改页面
	@RequestMapping("editUser")
	public String editUser(Integer uid, Model model) {
		// 根据id查询
		User user = userService.findById(uid);
		// 页面回显
		model.addAttribute("user", user);
		return "/user/editUser";
	}

	// 根据ID进行删除
	@RequestMapping("deleteById")
	public String deleteById(Integer uid) {
		userService.deleteById(uid);
		// 重定向到用户列表界面
		return "redirect:findAllUser";
	}

	@RequestMapping("editUserSubmit")
	public String editUserSubmit(Integer uid, User user) {
		userService.updateUser(uid, user);
		return "redirect:findAllUser";
	}


	@RequestMapping("registUser")
	@ResponseBody
	public Message registUser(User user) {
		Message msg=new Message();
		//根据登录名来判断
		int result = userService.findByUserLoginName(user.getLoginName());
		if(result==1){//登录名已经有了
			msg.setStr("用户登录名已经存在");
			return msg;
		}else{
			userService.save(user);//插入具体数据
			msg.setStr("success");
			return msg;
		}
	}
	/**
	 * 企业根据用户真实名字查询其详细
	 */
	@RequestMapping("findUserByRealname")
	public String findUserByRealname(String realname,Model model) {
		User user = userService.findUserByRealname(realname);
		if(user!=null){		
			model.addAttribute("user", user);
			return "/company/listUser";
		}else{
			throw new RuntimeException("对不起，没有该用户的具体信息");
		}
	}
	/**
	 * 用户登录
	 */
	@RequestMapping("login")
	public String login(Model model) {
		return "/login/login";
	}
	/**
	 * 跳转到注册页面
	 */
	@RequestMapping("regist")
	public String toRegist(Model model) {
		return "/regist/registUser";
	}

	@RequestMapping(value = "/exit")
	public String exit(HttpServletRequest request) throws Exception {
		//退出时清空session
		//request.getSession().invalidate();
		request.getSession().removeAttribute("currUser");
		return "/login/login";
	}


	@RequestMapping("exportSheet")
	public void exportSheet(HttpServletResponse response, HttpSession session) {
		List<User> list = userService.findAll();

		Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("用户信息", "user"),
				User.class, list);

		String encode = null;
		try {
			encode = URLEncoder.encode("用户信息.xls", "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		response.addHeader("Content-Disposition", "attachment;filename=" + encode);// 设置文件名


		ServletOutputStream os = null;
		try {
			os = response.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			workbook.write(os);
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	@RequestMapping("importSheet")
	public String importSheet(@RequestParam("file")MultipartFile file, HttpServletResponse response, HttpSession session) {
		ImportParams importParams = new ImportParams();
		importParams.setHeadRows(1);
		importParams.setTitleRows(1);

		try {
			InputStream inputStream = file.getInputStream();
			List<User> list = ExcelImportUtil.importExcel(inputStream, User.class, importParams);
			for (User user : list) {
				userService.save(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:findAllUser";
	}


}
