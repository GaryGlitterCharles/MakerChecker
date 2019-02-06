package com.makerchecker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String modify(Model model, String customerCode,Temperary temperary,Master master)
	{

		//model.addAttribute("getUser", new Temperary());
		model.addAttribute("modified", new Temperary());
		model.addAttribute("modified", new Master());
		//makerService.modify(customerCode, model,temperary,master);
		
		master = makerService.upM(customerCode);
		temperary =  makerService.up(customerCode);
		
		if(master==null)
		{
			
			model.addAttribute("toModify",temperary);
		}
		else {
			
			model.addAttribute("toModify", master);
		}
		
		
		return "modifyRecord";
	}

	@PostMapping("modify")
	public String name( @RequestParam("customerCode") String customerCode, @ModelAttribute("modified") Temperary temperary, @ModelAttribute("modified") Master master,Model model)
	{
		model.addAttribute("getUser", new Temperary());
		model.addAttribute("getUser", new Master());
		makerService.updateModify(temperary, customerCode);
		//model.addAttribute("toModify", makerService.up(customerCode));
		
		
		return "modifyRecord";
	}
	
	@PostMapping("modifyupdateDetails")
	public String name1(@RequestParam("customerCode") String customerCode, @ModelAttribute("modified") Temperary temperary, @ModelAttribute("modified") Master master,Model model)
	{
		model.addAttribute("getUser", new Temperary());
		model.addAttribute("getUser", new Master());
		makerService.update(temperary, master, customerCode);
		//makerService.createRecord(temperary);
		model.addAttribute("toModify",  makerService.up(customerCode));
		//model.addAttribute("toModify",  makerService.upM(customerCode));
		return "modifyRecord";
	}

//	@GetMapping("deleteFromTemp")
//	public String hard_delete_fromTemp_table(Model model) 
//	{
//
//		model.addAttribute("customerCode", new Master());
//		return "modify";
//	}
//
//	@GetMapping("deleteFromTemp1")
//	public String hard_delete_fromTemp_table1(Model model)
//	{
//		model.addAttribute("customerCode", new Temperary());
//		return "modify";
//	}

	@GetMapping("deleteFromTemp")
	public void hard_delete_fromTemp_table(@RequestParam("customerCode") String customerCode, Master master)
	{

		makerService.hard_delete_fromTemp_table(customerCode, master);
	}

	@GetMapping("deleteFromTemp1")
	public void hard_delete_fromTemp_table1(@RequestParam("customerCode") String customerCode, Temperary temperary)
	{

		makerService.hard_delete_fromTemp_table1(customerCode, temperary);
	}

	@GetMapping("getRecord")
	public String getRecord(Model model)
	{
		model.addAttribute("customerCode", new Temperary());
		model.addAttribute("customerCode", new Master());
		return "modify";
	}

	@PostMapping("getRecord")
	public String getRecord(@RequestParam("customerCode") String customerCode, Model model)
	{
		Master master = makerService.getRecordMA(customerCode);
		Temperary temperary = makerService.getRecordTE(customerCode);

		if (!(master == null) && !(temperary == null))
		{
			model.addAttribute("record", temperary);
		} else
		{

			model.addAttribute("recordM", master);

			model.addAttribute("record", temperary);
		}

		return "record";
	}

}
