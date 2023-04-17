package com.prowings.Employee_CURD_config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("1..servlet root configutation");
		
		return new Class [] {springMVCConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("1..servlet root configutation");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		System.out.println("3...servlet mapping configuration");
		String[] mapping= {"/"};
		return mapping;
	}

}
