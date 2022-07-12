package com.sindhura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Myfirstcontroller {
	
	@GetMapping("/hi")
	public String hello() {
		return "im sindhu";
	}

}
