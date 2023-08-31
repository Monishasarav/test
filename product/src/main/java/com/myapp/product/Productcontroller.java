package com.myapp.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class Productcontroller {
	@Autowired
	Productservice ser;

	@PostMapping(value = "/product")
	public String post(@RequestBody List<Productentity> a) {
		return ser.post(a);
	}

	@GetMapping(value = "/pro")
	public List<Productentity> get() {
		return ser.get();
	}
}
