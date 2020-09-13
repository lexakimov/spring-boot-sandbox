package com.example.springbootsandbox.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author akimov
 * created at 10.09.2020 19:13
 */
@Slf4j
//@Service
public class Service1Impl implements Service1 {

	@Override
	public String doSomeWork() {
		log.info("doSomeWork");
		return "done in real service 1";
	}
}
