package edu.mum.cs.waa.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import edu.mum.cs.waa.domain.Calculator;
import edu.mum.cs.waa.validator.Validator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;

@Controller
public class CalculatorController {

	@AutoWired
	Validator validator;

	@RequestMapping(value = { "/", "/form" })
	public String inputCalculator() {
		return "/WEB-INF/JSPs/form.jsp";
	}

	@RequestMapping(value = { "/calc" })
	public String saveProduct(Calculator calculator, HttpServletRequest request) {
		// ProductValidator productValidator = new ProductValidator();
		List<String> errors = validator.validate(calculator);
		if (errors.isEmpty()) {
			// no validation error, execute action method
			// insert code to save product to the database

			// store product in a scope variable for the view
			request.setAttribute("sum", calculator.getSum());
			request.setAttribute("product", calculator.getProduct());
			return "/WEB-INF/JSPs/result.jsp";
		} else {

			// store errors and product in a scope variable for the view
			request.setAttribute("errors", errors);
			request.setAttribute("form", calculator);
			return "/WEB-INF/JSPs/form.jsp";
		}
	}

}
