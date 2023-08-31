package com.myapp.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PostMapping;

@Service
public class Customerservice {
	@Autowired
	Customerdao dao;
	public String postvalue(Customer a) {
		return dao.postvalue(a);
	}
	public List<Customer> getvalue(){
		return dao.getvalue();
	}
	public String putvalue(int id,String name) {
		Customer c=dao.find(id);
		c.setName(name);
//		c.setAcno(c.getAcno());
//		c.setBranch(c.getBranch());
//		c.setIfsc(c.getIfsc());
		return dao.postvalue(c);
	}

}
