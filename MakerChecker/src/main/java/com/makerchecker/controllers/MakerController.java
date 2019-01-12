package com.makerchecker.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.makerchecker.domain.Temperary;
import com.makerchecker.repository.JpaRepoInterface;

@Controller
@RequestMapping("/maker")
public class MakerController
{
	@Autowired
	private JpaRepoInterface repo;
	
	@GetMapping("/create")
	public String createRecord(Model model)
	{
		model.addAttribute("newRecord", new Temperary());
		return "create";
	}
	
	@PostMapping("/create")
	public void createRecord(Temperary tempRecord)
	{
		repo.save(tempRecord);
	}
}
