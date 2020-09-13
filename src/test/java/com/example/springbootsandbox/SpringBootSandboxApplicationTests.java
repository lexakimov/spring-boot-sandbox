package com.example.springbootsandbox;

import com.example.springbootsandbox.service.Service1;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;

@SpringBootTest
@Slf4j
@TestConfiguration
class SpringBootSandboxApplicationTests {

	@Autowired
	Service1 service1;

	@Test
	void contextLoads() {
		log.info(service1.doSomeWork());
	}

}
