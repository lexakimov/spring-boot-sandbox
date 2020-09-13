package com.example.springbootsandbox.config;

import com.example.springbootsandbox.service.Service1;
import com.example.springbootsandbox.service.Service1TestImpl;
import org.springframework.context.annotation.Bean;

/**
 * @author akimov
 * created at 10.09.2020 19:16
 */

public class TestConfig {

	@Bean
	public Service1 service1() {
		return new Service1TestImpl();
	}

}
