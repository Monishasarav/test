package com.myapp.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="/hello")
public class dev {
	
	
	@GetMapping(value="/post")
	public String post() {
		return "HELLO";
	}

	

}
