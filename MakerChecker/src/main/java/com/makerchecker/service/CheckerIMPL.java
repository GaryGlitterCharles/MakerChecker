package com.makerchecker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.makerchecker.domain.Temperary;
import com.makerchecker.repository.JpaRepoInterfaceTemp;


@Service
public class CheckerIMPL
{
	@Autowired
	private JpaRepoInterfaceTemp repo;
	
	public void viewRecord(Temperary temperary,Model model)
	{
		model.addAttribute("viewRecords", repo.findAll());
	}
}
