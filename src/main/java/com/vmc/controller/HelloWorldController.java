package com.vmc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping("/")
	public String index(){
		System.out.println("----------------Entered into index method----------");
		return "index";
	}

	@GetMapping("/hello")
	public String sayHello(@RequestParam("userName") String userName,Model model){
		System.out.println("----------------Entered into sayHello method----------"+userName);
		model.addAttribute("name", userName);
		return "index";
	}
}
