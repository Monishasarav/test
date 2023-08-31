package com.myapp.devops1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
	@GetMapping("/devops1")
	public String get() {
		return "success";
	}

}
