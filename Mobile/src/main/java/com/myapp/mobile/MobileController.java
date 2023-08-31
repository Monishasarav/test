package com.myapp.mobile;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MobileController {

	RestTemplate r=new RestTemplate();
	@GetMapping(value="/read1")
	
		public String Getmsg() {
		String url1="http://ProductDetailsApi/read";
			ResponseEntity<String> a=r.exchange(url1,HttpMethod.GET,null,String.class);
			String b=a.getBody();
			return b;
		}
	}

