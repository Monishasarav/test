package com.myapp.userstory;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class UseProduct {
	@Autowired
	RestTemplate rest;
	
	@GetMapping(value="/setproductswithtax")
	public String getproductswithtax(){
	String url1="http://localhost:8082/product/pro";
	String url2="http://localhost:8080/gst/getpercent/";
	
	//ResponseEntity<List<Product>> res=rest.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<Product>>(){});
	//List<Product> pro=res.getBody();
	String n=rest.getForObject("http://localhost:8082/product/pro",String.class);
	
	/*for(Product p:pro) {
		int hsn=p.getHsncode();
		ResponseEntity<Integer> res1=rest.exchange(url2+hsn,HttpMethod.GET,null,Integer.class);
		int percent=res1.getBody();
		p.setPrice(p.getPrice()+p.getPrice()*percent/100);
		
	}*/
	return n;
	

	}

}
