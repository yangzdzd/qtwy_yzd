package com.qtwy.controller;

import com.qtwy.pojoExt.JobInfoExt;
import com.qtwy.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/job")
public class JobController {
	@Autowired
	private IJobService iJobService;
	/**
	 * 查询出所有的职位
	 * */
	@RequestMapping("findAllJob")
	public String findAllJob(String jobName,String jobAddress,String companyName,Model model){
		List<JobInfoExt> jobInfoList = iJobService.findAll(jobName,jobAddress,companyName);
		model.addAttribute("jobInfoList", jobInfoList);
		return "/job/listAllJob";
	}
}
