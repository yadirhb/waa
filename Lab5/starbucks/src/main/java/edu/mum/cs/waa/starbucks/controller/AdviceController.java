package edu.mum.cs.waa.starbucks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import edu.mum.cs.waa.starbucks.domain.Roast;
import edu.mum.cs.waa.starbucks.service.AdviceService;

@Controller
@SessionAttributes("user")
public class AdviceController {

	@Autowired
	AdviceService service;

	@GetMapping("/advice/form")
	public String index() {
		return "advice";
	}

	@GetMapping("/advice")
	public String getAdvicesByRoast(@RequestParam("roast") String roast, Model model) {
		if (roast == null || roast.isEmpty()) {
			model.addAttribute("errors", new String[] { "The roast cannot be empty." });
			return "advice";
		}

		model.addAttribute("advices", service.getAdvicesByRoast(Roast.valueOf(roast)));

		return "display";
	}
}
