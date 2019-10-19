package com.springboot.practice.WebServicePractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.annotation.Resource;
import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class WebServicePracticeApplication {

	private static final String MESSAGE_SOURCE_FILE_NAME = "messages";
	public static void main(String[] args) {
		SpringApplication.run(WebServicePracticeApplication.class, args);
	}

	@Bean
	public LocaleResolver localeResolver(){
		/* old approach
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.US);*/
		AcceptHeaderLocaleResolver localeResolverObj = new AcceptHeaderLocaleResolver();
		return localeResolverObj;
	}

/* Old approach - can be replaced with
    spring.messages.basename property (in application.properties)
	@Bean
	public ResourceBundleMessageSource messageSource(){
		ResourceBundleMessageSource messageSourceObj = new ResourceBundleMessageSource();
		messageSourceObj.setBasename(MESSAGE_SOURCE_FILE_NAME);
		return messageSourceObj;
	}*/

}
