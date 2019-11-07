package edu.mum.controller;

import java.io.File;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import edu.mum.domain.Employee;
import edu.mum.exception.EmployeeImagenException;

@org.springframework.stereotype.Controller

public class EmployeeController {

	private static final Log logger = LogFactory.getLog(EmployeeController.class);

	@Autowired
	private ServletContext servletContext;

	@RequestMapping(value = { "/", "employee_input" })
	public String inputEmployee(@ModelAttribute("employee") Employee employee) {
		return "EmployeeForm";
	}

	@ExceptionHandler(EmployeeImagenException.class)
	public String handleError(Model model, EmployeeImagenException exception) {
		model.addAttribute("errors.image", exception.getMessage());
		return "EmployeeForm";
	}

	@RequestMapping(value = "/employee_save")
	public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
			Model model) {

		String[] suppressedFields = bindingResult.getSuppressedFields();
		if (suppressedFields.length > 0) {
			bindingResult.reject("foo", "***YOU TRIED USING A SUPPRESSED FIELD***");
		}

		if (bindingResult.hasErrors()) {
			return "EmployeeForm";
		}

		// Added this code to upload images
		MultipartFile employeeImage = employee.getImage();

		if (employeeImage != null && !employeeImage.isEmpty()) {
			try {
				String uploadsDir = "/uploads/";
				String realPathtoUploads = servletContext.getRealPath(uploadsDir);
				if (!new File(realPathtoUploads).exists()) {
					new File(realPathtoUploads).mkdir();
				}

				String orgName = employeeImage.getOriginalFilename();
				String filePath = realPathtoUploads + orgName;
				File dest = new File(filePath);

				employeeImage.transferTo(dest);
			} catch (Exception e) {
				logger.error("Error uploading the image", e);
				throw new EmployeeImagenException(e);
			}
		}

		// save product here

		model.addAttribute("employee", employee);

		return "EmployeeDetails";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
//        binder.setDisallowedFields(new String[]{"firstName"});
	}
}
