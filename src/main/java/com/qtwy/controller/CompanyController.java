package com.qtwy.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.qtwy.entity.Company;
import com.qtwy.entity.Job;
import com.qtwy.entity.Message;
import com.qtwy.service.ICompanyService;
import com.qtwy.service.IJobService;
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
import java.util.Date;
import java.util.List;

//import com.qtwy.util.EncodingTool;



@Controller
@RequestMapping("/com")
public class CompanyController {

	@Autowired
	public ICompanyService companyService;
	@Autowired
	private IJobService iJobService;
	// 查询所有用户
	@RequestMapping("findAllCompany")
	public String findAllCompany(Model model) {
		List<Company> companyList = companyService.findAll();
		model.addAttribute("companyList", companyList);
		return "/company/listAllCompany";
	}

	// 跳转到修改页面
	@RequestMapping("editCompany")
	public String editCompany(Integer cid, Model model) {
		// 根据id查询
		Company company = companyService.findCompanyById(cid);
		// 页面回显
		model.addAttribute("company", company);
		return "/company/editCompany";
	}

	// 根据ID进行删除
	@RequestMapping("deleteById")
	public String deleteById(Integer cid) {
		companyService.deleteById(cid);
		// 重定向到列表界面
		return "redirect:findAllCompany";
	}
	@RequestMapping("editCompanySubmit")
	public String editUserSubmit(Company company) {
		companyService.updateCompany(company);
		return "redirect:findAllCompany";
	}
	// 企业注册
	@RequestMapping("registCom")
	@ResponseBody
	public Message registCom(Company company) {
		Message msg=new Message();
		int result = companyService.findCompanyByName(company.getCompanyLoginName());//获得公司登录名去数据库中查询
		if(result==1){//公司登录名已经存在
			msg.setStr("公司登录名已经存在");
			return msg;
		}else if(result==0){//公司登录名也没被注册
				int result_ = companyService.findByCompanyName(company.getCompanyName());	//判断公司名称是否唯一
				if(result_==1){
					msg.setStr("公司名已经存在");
					return msg;
				}else{
					//公司名字也没被注册
						companyService.save(company);//插入具体数据
						msg.setStr("success");
						return msg;
					}
			}
			return msg;
		}
	/**
	 * 查询一个企业详细信息
	 * */
	@RequestMapping("show")
	public String show(Integer cid,String jobName,String jobAddress,Date releaseTime,Double jobSalary,String companyName,Model model){
		Company company = companyService.findCompanyById(cid);
		model.addAttribute("jobName", jobName);
		model.addAttribute("jobAddress", jobAddress);
		model.addAttribute("releaseTime", releaseTime);
		model.addAttribute("jobSalary",jobSalary);
		model.addAttribute("companyName",companyName);
		model.addAttribute("company", company);
		return "/job/showOneCompany";
	}
	/**
	 * 企业登录
	 * */
	@RequestMapping("accessComLogin")
	@ResponseBody
	public Message accessComLogin(HttpServletRequest request, String companyLoginName, String companyPwd,Model model) {
		Company currCom = companyService.getCompanyByNameAndPwd(companyLoginName,companyPwd);//根据登录名向数据库中查询用户
		Message msg=new Message();
		if(currCom==null){
			msg.setStr("fail");
			return msg;
		}else{
			HttpSession session = request.getSession();
			session.setAttribute("currCom", currCom);
			msg.setStr("success");
			return msg;
		}
	}
	/**
	 * 跳转到添加职位页面
	 * */
	@RequestMapping("toAddPost")
	public String toAddPost(Model model) {
		return "/company/addPost";
	}	
	

	/**
	 * 添加职位
	 * */
	@RequestMapping("addPost")
	@ResponseBody
	public Message addPost(HttpServletRequest request,String jobName,String jobAddress,Double jobSalary,
			Integer cid) {
			Message msg=new Message();
			Company company = (Company) request.getSession().getAttribute("currCom");
			if(company!=null){
				Job job= iJobService.findByCidAndJobName(cid,jobName);
				if(job==null){
					//将数据封装到新的job对象，插入数据库
					Job job_=new Job();
					job_.setCid(String.valueOf(cid));
					job_.setJobAddress(jobAddress);
					job_.setJobName(jobName);
					job_.setJobSalary(jobSalary);
					job_.setReleaseTime(new Date());
					int result = iJobService.insertJob(job_);
					if(result==1){
						msg.setStr("success");
						return msg;				
					}else{
						msg.setStr("插入职位失败");
						return msg;
					}
				}else{
					//不可以
					msg.setStr("新增的职位名称不可以重复");
					return msg;
				}
			}else{
				msg.setStr("fail");
				return msg;
			}		
	}
	/**
	 * 跳转至企业登录页面
	 */
	@RequestMapping("login")
	public String login() {
		return "/company/login";
	}	
	/**
	 * 跳转至企业注册页面
	 */
	@RequestMapping("regist")
	public String regist() {
		return "/regist/registCom";
	}	
	/**
	 * 跳转至企业首页
	 */
	@RequestMapping("index")
	public String index() {
		return "/company/index";
	}	
	/**
	 * 退出登录
	 */
	@RequestMapping(value = "/exit")
	public String exit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//退出时清空session
		//request.getSession().invalidate();
		request.getSession().removeAttribute("currCom");
		return "/company/login";
	}
	/**
	 * 跳转到后台top.jsp
	 */
	@RequestMapping("top")
	public String toTop() {
		return "/company/top";
	}
	/**
	 * 跳转到left.jsp
	 */
	@RequestMapping("left")
	public String toLeft() {
		return "/company/left";
	}
	/**
	 * 跳转到body.jsp
	 */
	@RequestMapping("body")
	public String toBody() {
		return "/company/body";
	}


	@RequestMapping("exportSheet")
	public void exportSheet(HttpServletResponse response, HttpSession session) {
		List<Company> list = companyService.findAll();

		Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams("公司信息", "company"),
				Company.class, list);


		String encode = null;
		try {
			encode = URLEncoder.encode("公司信息.xls", "UTF-8");
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
	public String importSheet(@RequestParam("file") MultipartFile file, HttpServletResponse response, HttpSession session) {
		ImportParams importParams = new ImportParams();
		importParams.setHeadRows(1);
		importParams.setTitleRows(1);

		try {
			InputStream inputStream = file.getInputStream();
			List<Company> list = ExcelImportUtil.importExcel(inputStream, Company.class, importParams);
			for (Company company : list) {
				companyService.save(company);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:findAllCompany";
	}

}
