package com.qtwy.controller;

import com.qtwy.entity.Apply;
import com.qtwy.entity.Company;
import com.qtwy.entity.Message;
import com.qtwy.service.IApplyJobService;
//import com.qtwy.util.EncodingTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
/**
 * 求职申请控制
 * */
@Controller
@RequestMapping("/apply")
public class ApplyJobController {
	@Autowired
	private IApplyJobService applyJobService;
	/**
	 * 企业查询所有的申请者
	 * */
	@RequestMapping("/findApply")
	public String findAllApply(String companyName,Model model,HttpServletRequest request){
		Company company = (Company) request.getSession().getAttribute("currCom");
		if(company!=null){
			//String currCompanyName= EncodingTool.encodeStr(companyName);
			List<Apply> applyList = applyJobService.findAllByCompanyName(companyName);
			model.addAttribute("applyList", applyList);
			return "/apply/showApply";
		}else{
			return "/company/relogin";
		}
	}
	/**
	 * 接收界面参数，判断是否是第一次插入
	 * */
	@RequestMapping("/accpet")
	@ResponseBody
	public Message accpet(String jobName,String jobAddress,Date releaseTime,
			String realname,Double jobSalary,String companyName){
		Message  message=new Message();
		if(realname==null ||realname.isEmpty()){//判断用户是否登录
			message.setStr("您还没有登录！");
			return message;
		}
		Apply apply = applyJobService.findApplyByAll(realname,jobAddress,jobName);
		if(apply==null){
			//插入职位具体数据
			Apply apply_=new Apply();
			apply_.setJobAddress(jobAddress);
			apply_.setJobName(jobName);
			apply_.setJobSalary(jobSalary);
			apply_.setRealname(realname);
			apply_.setReleaseTime(releaseTime);
			apply_.setCompanyName(companyName);
			int result=applyJobService.insertApply(apply_);
			if(result==1){
				message.setStr("投递成功！");
				return message;
			}else{
				message.setStr("不好意思，投递失败！");
				return message;
			}
		}else{
			//第二次申请
			message.setStr("请不要重复投递！");
			return message;
		}
	}
	/**
	 * 职位投递记录
	 * */
	@RequestMapping("/applyRecord")
	public String findApplyByRealName(String realname,Model model){
		List<Apply> applyList_ = applyJobService.findApplyRecordByRealname(realname);
		model.addAttribute("applyList_", applyList_);
		return "/apply/showApplyRecord";
	}
	/**
	 * 根据ID删除职位投递记录
	 * */
	@RequestMapping("deleteById")
	public String deleteById(Integer sid) {
		applyJobService.deleteById(sid);
		// 重定向到投递记录界面
		return "redirect:applyRecord";
	}
}
