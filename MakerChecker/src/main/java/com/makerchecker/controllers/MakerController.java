package com.makerchecker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.makerchecker.domain.Master;
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
	
//	@GetMapping("modify")
//	public String modify(Model model)
//	{
//		model.addAttribute("customerCode", new Temperary());
//		
//		return "modify";
//	}
	
	@GetMapping("modify")
	public String modify(Temperary temperary,@RequestParam("customerCode") String customerCode,Model model)
	{
		model.addAttribute("customerCode", new Temperary());
		model.addAttribute("modified", new Temperary());
		model.addAttribute("toModify", makerService.modify(customerCode));
		return "modifyRecord";
	}
	@PostMapping("modifyupdate")
	public void name(Temperary temperary)
	{
		makerService.updateModify(temperary);
	}
	
	@GetMapping("deleteFromTemp")
	public String hard_delete_fromTemp_table(Model model)
	{
		model.addAttribute("customerCode", new Temperary());
		return "modify";
	}
	@GetMapping("deleteFromTemp")
	public void hard_delete_fromTemp_table(@RequestParam("customerCode") String customerCode,Temperary temperary)
	{
	
		makerService.hard_delete_fromTemp_table(customerCode,temperary);
	}
	
	@GetMapping("getRecord")
	public String getRecord(Model model)
	{
		model.addAttribute("customerCode", new Temperary());
		model.addAttribute("customerCode", new Master());
		return "modify";
	}
	@PostMapping("getRecord")
	public String getRecord(@RequestParam("customerCode") String customerCode,Model model)
	{
		model.addAttribute("record", makerService.getRecordTE(customerCode));
		model.addAttribute("recordM", makerService.getRecordMA(customerCode));
		
		return "record";
	}
}
