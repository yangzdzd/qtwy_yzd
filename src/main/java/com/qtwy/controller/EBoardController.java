package com.qtwy.controller;

import com.qtwy.entity.Eboard;
import com.qtwy.service.IEboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;



@Controller
@RequestMapping("/eboard")
public class EBoardController {//系统公告以及职位新闻
	
	@Autowired
	public IEboardService eboardService;
	

	@RequestMapping("/showNews")
	public String showJournalism(Model model){
		List<Eboard> eboardList = eboardService.findAllJournalism();
		model.addAttribute("eboardList", eboardList);
		return "/main/listEboard";
	}

	@RequestMapping("/findAllEboard")
	public String findAllEboard(Model model) {
		List<Eboard> eboardList = eboardService.findAllJournalism();
		model.addAttribute("eboardList", eboardList);
		return "/eboard/listEboard";
	}

	@RequestMapping("/deleteEboard")
	public String deleteEboard(Integer eid) {
		eboardService.delete(eid);
		return "redirect:findAllEboard";
	}

	@RequestMapping("/updateEboard")
	public String updateEboard(Integer eid,Model model) {
		Eboard eboard = eboardService.selectOne(eid);
		model.addAttribute("eboard",eboard);
		return "/eboard/editEboard";
	}

	@RequestMapping("/updateEboardSubmit")
	public String updateEboardSubmit(Eboard eboard) {
		eboardService.update(eboard);
		return "redirect:findAllEboard";
	}

	@RequestMapping("/insertEboard")
	public String insertEboard(Eboard eboard) {
		eboardService.insert(eboard);
		return "redirect:findAllEboard";
	}
}
