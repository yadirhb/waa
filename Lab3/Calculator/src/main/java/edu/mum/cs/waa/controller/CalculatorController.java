package edu.mum.cs.waa.controller;

import edu.mum.cs.waa.domain.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CalculatorController {

    @GetMapping({"/"})
    public String index(@ModelAttribute("calculator") Calculator calculator) {
        return "form";
    }

    @PostMapping({"/"})
    public String calc(@Valid @ModelAttribute("calculator") Calculator calculator, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute(calculator);
            return "form";
        }

        model.addAttribute("sum", calculator.getSum());
        model.addAttribute("product", calculator.getProduct());
        return "result";
    }
}
