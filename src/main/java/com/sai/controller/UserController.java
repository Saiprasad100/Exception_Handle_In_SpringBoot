package com.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping("/greet")
	public String getGreetMsg(Model model) {

		String msgTxt = "Good Morning.....";
		model.addAttribute("msg", msgTxt);
		return "index";

	}

	@GetMapping("/")
	public String getMessage(Model model) {

		String msgTxt = "Good Evening EveryOne.....";

//Demo stash (Bug number 129)
 int b=101
		int a = 10 / 0;

		model.addAttribute("msg", msgTxt);
		return "index";

	}

}
