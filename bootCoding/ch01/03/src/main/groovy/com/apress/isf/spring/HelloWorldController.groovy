package com.apress.isf.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@EnableAutoConfiguration
public class HelloWorldController {

	@GetMapping("/")
	@ResponseBody()
	String getMessage() {
		return "<h1>Hello World Groovy!</h1?"
	}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloWorldController.class, args)
	}
}