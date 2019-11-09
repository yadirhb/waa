package edu.mum.cs.waa.starbucks.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.mum.cs.waa.starbucks.domain.User;
import edu.mum.cs.waa.starbucks.service.UserService;

@Controller
public class AuthenticationController {

	@Autowired
	UserService service;

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "index";
		}
		String storedPassword = service.findPassword(user.getUsername());
		if (storedPassword == null || storedPassword.isEmpty()) {
			model.addAttribute("errors", new String[] { "Username or password not found." });
			return "index";
		}

		return "redirect:advice/form";

	}
}
