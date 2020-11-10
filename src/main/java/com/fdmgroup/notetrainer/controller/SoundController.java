package com.fdmgroup.notetrainer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SoundController {

	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	@RequestMapping("/home")
	public String getHome() {
		return "home";
	}
	
}