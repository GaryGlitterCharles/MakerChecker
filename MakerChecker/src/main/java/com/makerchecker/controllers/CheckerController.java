package com.makerchecker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.makerchecker.domain.Temperary;
import com.makerchecker.service.CheckerIMPL;

@Controller
@RequestMapping("checker")
public class CheckerController
{
	@Autowired
	private CheckerIMPL checkerIMPL;
	
	@GetMapping("/showRecord")
	public String viewRecord(Temperary temperary,Model model)
	{
		checkerIMPL.viewRecord(temperary, model);
		return "checkerView";
	}
}
