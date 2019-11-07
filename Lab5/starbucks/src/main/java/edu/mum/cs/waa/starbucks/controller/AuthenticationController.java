package edu.mum.cs.waa.starbucks.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.WebRequest;

import edu.mum.cs.waa.starbucks.domain.User;
import edu.mum.cs.waa.starbucks.service.UserService;

@Controller
public class AuthenticationController {

	@Autowired
	UserService service;

	@GetMapping("/login")
	public String login(HttpSession session) {
		User userSession = (User) session.getAttribute("user");
		if (userSession != null) {
			return "redirect:/advice/form";
		}

		return "index";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model,
			HttpSession session) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			return "index";
		}

		if (user != null && (user.getUsername() != null && !user.getUsername().isEmpty())) {
			String storedPassword = service.findPassword(user.getUsername());
			if (storedPassword != null && !storedPassword.isEmpty()) {
				session.setAttribute("user", user);

				return "redirect:/advice/form";
			}
		}

		model.addAttribute("errors", new String[] { "Username or password not found." });
		return "index";
	}

	@PostMapping("/logout")
	public String logout(WebRequest request, SessionStatus status) {
		status.setComplete();
		request.removeAttribute("user", WebRequest.SCOPE_SESSION);
		return "redirect:/";
	}
}
