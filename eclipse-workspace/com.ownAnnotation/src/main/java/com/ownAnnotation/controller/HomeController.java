package com.ownAnnotation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ownAnnotation.pojo.User;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home(@ModelAttribute("user") User user) {
		
		
		System.out.println("your in home method");
		return "Home";
	}

	@RequestMapping("process")
	public String process(@Valid @ModelAttribute("user") User user, BindingResult result) {
		System.out.println("user name is empty of fillied |"+user.getName()+"|");
			if(result.hasErrors()) {
				List<ObjectError> allErrors = result.getAllErrors();
				System.out.println(allErrors);
				return "Home";
			}
		return "DetailView";
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		StringTrimmerEditor editor = new StringTrimmerEditor(false);
		binder.registerCustomEditor(String.class, "name", editor);
		//binder.setDisallowedFields("phone");
		
		
	}

}
