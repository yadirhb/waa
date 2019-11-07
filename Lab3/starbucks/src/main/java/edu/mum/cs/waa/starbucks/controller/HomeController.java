package edu.mum.cs.waa.starbucks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.cs.waa.starbucks.domain.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index";
	}

}
