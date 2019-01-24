package com.makerchecker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.makerchecker.domain.Temperary;
import com.makerchecker.service.CheckerService;

@Controller
@RequestMapping("checker")
public class CheckerController
{
	
	@Autowired
	private CheckerService checkerService;

	@GetMapping("/showRecord")
	public String viewRecord(Temperary temperary, Model model)
	{
		model.addAttribute("viewRecords", checkerService.getAllRecords());
		return "checkerView";
	}

	@GetMapping("/authorize")
	public void authorize(Temperary temperary, @RequestParam("customerCode") String customerCode)
	{

		checkerService.authorizeRecord(temperary, customerCode);
	}
	
	@GetMapping("/reject")
	public void name(@RequestParam("customerCode") String customerCode)
	{
		checkerService.reject(customerCode);
	}
}
