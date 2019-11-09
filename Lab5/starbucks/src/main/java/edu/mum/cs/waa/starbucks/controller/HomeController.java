package edu.mum.cs.waa.starbucks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "redirect:/login";
	}

}
