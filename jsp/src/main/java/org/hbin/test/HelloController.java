package org.hbin.test;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@Value("${application.msg:XX}")
	private String msg;

	@RequestMapping("/hello")
	public String hello(Map<String, Object> map) {
		Date now = new Date();
		map.put("time", now);
		System.out.println("[HelloController hello()] time: " + now);
		return "hello";
	}

	@RequestMapping("/hi")
	public String hi(Map<String, Object> map) {
		map.put("msg", msg);
		System.out.println("[HelloController hi()] msg: " + msg + ", time: " + new Date());

		return "hello";
	}
}