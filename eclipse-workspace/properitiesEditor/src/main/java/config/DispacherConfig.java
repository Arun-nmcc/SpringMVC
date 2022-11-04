package config;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@EnableWebMvc
public class DispacherConfig extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] arr = {ApplicationConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String[] arr = {"/"};
		return arr;
	}

}
