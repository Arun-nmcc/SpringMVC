package com.ownAnnotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.ownAnnotation.formatter.ImpCreditFormatter;

import com.ownAnnotation.formatter.ImpPhoneFormatter;
@Configuration
@ComponentScan(basePackages = "com.ownAnnotation.controller,com.ownAnnotation.annotation")
@EnableWebMvc
public class ApplicationContextConfig implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver com() {
		InternalResourceViewResolver rs = new InternalResourceViewResolver();
		rs.setPrefix("/view/");
		rs.setSuffix(".jsp");
		return rs;
				
		
	}
	@Override
	public void addFormatters(FormatterRegistry registry) {
		// TODO Auto-generated method stub
		registry.addFormatter(new ImpCreditFormatter());
		registry.addFormatter(new ImpPhoneFormatter());
	}
	
	
	

}
