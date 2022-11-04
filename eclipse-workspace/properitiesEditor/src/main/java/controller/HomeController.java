package controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(@ModelAttribute("bill") Bill bill) {
		return "home";
	}
	@RequestMapping("pro")
	public String process(@Valid @ModelAttribute("bill") Bill bill ,BindingResult result) {
		
		
		return"detail";
		
		
		
		
	}
	@InitBinder
	public void initBinder(WebDataBinder bind) {
		
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor editor = new CustomDateEditor(format, false);
		bind.registerCustomEditor(java.util.Date.class, "date", editor);
	}

}
