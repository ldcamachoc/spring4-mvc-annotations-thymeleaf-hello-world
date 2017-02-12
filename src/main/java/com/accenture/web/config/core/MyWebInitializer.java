package com.accenture.web.config.core;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.accenture.web.config.SpringWebContext;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringWebContext.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}