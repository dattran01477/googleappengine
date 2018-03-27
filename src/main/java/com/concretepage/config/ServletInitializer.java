package com.concretepage.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import com.concretepage.MyApplication;

public class ServletInitializer extends SpringBootServletInitializer {
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(MyApplication.class);
	  }
	}
