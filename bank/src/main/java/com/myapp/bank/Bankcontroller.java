package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/bank")
public class Bankcontroller {
	@Autowired
	Bankservice ser;
	@PostMapping(value="/postbank")
	public String postbank(@RequestBody List<Bank> a) {
		return ser.postbank(a);
	}
	@GetMapping(value="/getbank/{branch}")
    public int getbank(@PathVariable String branch){
		return ser.getbank(branch);
	}
}
