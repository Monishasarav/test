package com.myapp.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Customerdao {
	@Autowired
	Customerrepo repo;

	public String postvalue(Customer a) {
		repo.save(a);
		return "updated";
	}

	public List<Customer> getvalue() {
		return repo.getvalue();
	}
	public Customer find(int id) {
		return repo.findById(id).get();
		
	}

}
