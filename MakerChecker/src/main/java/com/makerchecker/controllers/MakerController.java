package com.makerchecker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.makerchecker.domain.Temperary;
import com.makerchecker.service.MakerService;

@Controller
@RequestMapping("/maker")
public class MakerController
{
	@Autowired
	private MakerService makerService;
	
	@GetMapping("/create")
	public String createRecord(Model model)
	{
		model.addAttribute("newRecord", new Temperary());
		return "create";
	}
	
	@PostMapping("/create")
	public void createRecord(Temperary tempRecord)
	{ 
		makerService.createRecord(tempRecord);
	}
	
	@GetMapping("modify")
	public String modify(Model model)
	{
		model.addAttribute("customerCode", new Temperary());
		return "modify";
	}
	
	@PostMapping("modify")
	public String modify(Temperary temperary,@RequestParam("customerCode") String customerCode,Model model)
	{
		model.addAttribute("customerCode", new Temperary());
		makerService.modify(temperary,customerCode,model);
		return "modify";
	}
	
}
