package com.myapp.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/customer")
public class Customercontroller {
	@Autowired
	Customerservice ser;
	RestTemplate rest;

	@PostMapping(value = "/postval")
	public String postvalue(@RequestBody Customer a) {
		String url1 = "http://localhost:9001/bank/postbank/";
		ResponseEntity<String> res1 = rest.exchange(url1 + a.getBranch(), HttpMethod.GET, null, String.class);
		String v = res1.getBody();
		a.setIfsc(v);
		return ser.postvalue(a);
	}

	@GetMapping(value = "/get")
	public List<Customer> getvalue() {
		return ser.getvalue();
	}

	@PutMapping(value = "/putvalue")
	public String putvalue(@RequestParam int id,@RequestParam String name) {
		return ser.putvalue(id,name);
	}
	
	 

}
