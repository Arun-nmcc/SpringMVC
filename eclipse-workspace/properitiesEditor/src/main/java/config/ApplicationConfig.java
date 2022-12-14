package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "controller")
public class ApplicationConfig implements WebMvcConfigurer{
	@Bean
	public InternalResourceViewResolver res() {
		InternalResourceViewResolver in = new InternalResourceViewResolver();
				in.setPrefix("/View/");
		in.setSuffix(".jsp");
		return in;
		
	}
	
	
	
	
	
	
	

}
