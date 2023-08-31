package com.myapp.springSecurity;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Configuration
//@EnableWebSecurity
public class SecurityController {
	
@GetMapping(value="/student")

	public String getmsg() {
		return "student";
	}
@GetMapping(value="/trainer")
public String gettrainer() {
	return "trainer";
}
@GetMapping(value="/manager")
	public String getmanager() {
		return "manager";
	}
}


