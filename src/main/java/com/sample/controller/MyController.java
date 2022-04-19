package com.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String Sample()
	{
		System.out.println("Hey we are here");
		return "index.jsp";
	}
}
