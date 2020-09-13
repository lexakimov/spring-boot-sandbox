package com.example.springbootsandbox.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author akimov
 * created at 09.09.2020 22:39
 */
@RestController
public class SimpleController {

	/**
	 * My first endpoint.
	 *
	 * @return some map
	 */
	@GetMapping
	public Map<String, String> get() {
		final Map<String, String> ret = new HashMap<>();
		ret.put("key_1", "value_1");
		ret.put("key_2", "value_2");
		ret.put("key_3", "value_3");
		return ret;
	}


}
