package com.payplot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicationController {

	 @GetMapping(value = {"/", "","/index","index"})
	 public String mainPage(){
		 return "index";
	 }
	
}
