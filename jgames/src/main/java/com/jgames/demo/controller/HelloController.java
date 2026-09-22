package com.jgames.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String toHello(Model model) {
		model.addAttribute("hello", "hello world!");
		return "hello";
	}
	
	@GetMapping("test")
	@ResponseBody
	public TestData getTest(@RequestParam int year) {
		
		int now = LocalDate.now().getYear();
		
		int age = now - year;
		
		return new TestData(age, TestEnum.THREE);
	}
}


record TestData (int age, TestEnum e) {
	
}

enum TestEnum {
	ONE("1"),
	TWO("2"),
	THREE("3");
	
	TestEnum(String data){
		this.data = data;
	}
	
	private String data;
	
	public String getData() {
		return data;
	}
}