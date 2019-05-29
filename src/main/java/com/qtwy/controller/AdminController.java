package com.qtwy.controller;

import com.qtwy.entity.Admin;
import com.qtwy.entity.Message;
import com.qtwy.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IAdminService adminService;
	/**
	 * 管理员登录
	 * */
	@RequestMapping("login")
	public String AdminLogin(Model model){
		return "/admin/login";//admin目录下的login页面
	}
	/**
	 * 后台首页
	 * */
	@RequestMapping("index")
	public String AdminIndex(Model model){
		return "/admin/index";
	}
	/**
	 * 跳转到后台top.jsp
	 */
	@RequestMapping("top")
	public String toTop() {
		return "/admin/top";
	}
	/**
	 * 跳转到left.jsp
	 */
	@RequestMapping("left")
	public String toLeft() {
		return "/admin/left";
	}
	/**
	 * 跳转到body.jsp
	 */
	@RequestMapping("body")
	public String toBody() {
		return "/admin/body";
	}
	/**
	 * 进入管理员登录
	 * */
	@RequestMapping("accessLogin")
	@ResponseBody
	public Message accessLogin(HttpServletRequest request, String adminName, String adminPwd, Model model) {
		Admin currAdmin = adminService.getAdminByNameAndPwd(adminName,adminPwd);//根据登录名向数据库中查询用户
		Message msg=new Message();
		if(currAdmin==null){
			msg.setStr("fail");
			return msg;
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("currAdmin", currAdmin);
			msg.setStr("success");
			return msg;
		}
	}
	/**
	 * 退出登录
	 */
	@RequestMapping(value = "/exit")
	public String exit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//退出时清空session
		//request.getSession().invalidate();
		request.getSession().removeAttribute("currAdmin");
		return "/admin/login";
	}
}
