package com.immo.Bankhi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ImmoControlleur {
	/*
	@Autowired
	private IImmobilisationMetier iImmobilisationMetier; */
	
	@RequestMapping("/immo")
	public String index(){
		return "immo";
	}
}
