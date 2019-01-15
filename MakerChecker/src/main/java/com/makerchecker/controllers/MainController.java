package com.makerchecker.controllers;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController
{
	@Autowired
	private SessionFactory sessionFactory;
	public void name()
	{
		
	}
}
