package com.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

	@GetMapping("/welcome")
	public String getGreetMsg(Model model) {

		String s = null;
		s.length();

		String msgTxt = "Welcome To Numetry.....";
		model.addAttribute("msg", msgTxt);
		return "index";

	}
}
