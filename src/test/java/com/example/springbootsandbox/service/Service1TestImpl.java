package com.example.springbootsandbox.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author akimov
 * created at 10.09.2020 19:20
 */
@Slf4j
public class Service1TestImpl implements Service1 {

	@Override
	public String doSomeWork() {
		log.info("doSomeWork in test service 1");
		return "done in test service 1";
	}
}
