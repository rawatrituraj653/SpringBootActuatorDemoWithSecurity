package com.msg.rest;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/show")
	public String getDate() {
		
		return "<h1>Today Date is:::"+new Date()+"<h1>";
	}
}
