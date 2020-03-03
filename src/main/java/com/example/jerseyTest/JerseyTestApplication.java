package com.example.jerseyTest;

import com.example.config.JerseyConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JerseyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JerseyTestApplication.class, args);
	}
	@Bean
	public ServletRegistrationBean jerseyServlet() {

		ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/api/*");

		// our rest resources will be available in the path /rest/*

		registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyConfig.class.getName());

		return registration;

	}
}
