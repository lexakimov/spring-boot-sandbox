package com.example.springbootsandbox.config;

import com.example.springbootsandbox.service.Service1;
import com.example.springbootsandbox.service.Service1Impl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author akimov
 * created at 09.09.2020 22:38
 */
@Configuration
public class AppConfig {

	@Bean
	public Service1 service1() {
		return new Service1Impl();
	}


}
