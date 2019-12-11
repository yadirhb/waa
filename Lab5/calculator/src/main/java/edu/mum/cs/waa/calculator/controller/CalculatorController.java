package edu.mum.cs.waa.calculator.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.cs.waa.calculator.domain.Calculator;

@Controller
public class CalculatorController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@ModelAttribute("calculator") Calculator calculator) {
		return "index";
	}

	@PostMapping({ "/" })
	public String calc(@Valid @ModelAttribute("calculator") Calculator calculator, BindingResult bindingResult,
			Model model, RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("errors", bindingResult.getAllErrors());
			model.addAttribute(calculator);
			return "index";
		}
		
		redirectAttributes.addFlashAttribute(calculator);
		redirectAttributes.addFlashAttribute("sum", calculator.getSum());
		redirectAttributes.addFlashAttribute("product", calculator.getProduct());
		return "redirect:/";
	}
}
