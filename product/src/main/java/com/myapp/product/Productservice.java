package com.myapp.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;

@Service
public class Productservice {
	@Autowired
	Productdao dao;
	public String post(List<Productentity> a) {
		return dao.post(a);
	}
	public List<Productentity> get() {
		List<Productentity> a=dao.getlist();
		return a;
	}

}
