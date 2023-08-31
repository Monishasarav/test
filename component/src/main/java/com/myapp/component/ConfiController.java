package com.myapp.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConfiController {
	@Autowired
	RestTemplate a;
	@GetMapping(value="/viewmsg")
	public String getmsg() {
		String url="http://localhost:7001/hello/post";
		ResponseEntity<String> res=a.exchange(url,HttpMethod.GET,null,String.class);
		String ans=res.getBody();
		return ans;
	}
}
