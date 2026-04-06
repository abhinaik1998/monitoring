package com.example.demomonitor.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class  home {

	@GetMapping("/home")
	public String homeController() {
		return "home";
	}
}
