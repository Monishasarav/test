package com.myapp.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.myapp.employee.Employee;
@Repository
public class Productdao {
	@Autowired
	Productrepository repo;
	public String post(List<Productentity> a) {
		repo.saveAll(a);
		return "updated successfully";
	}
	public List<Productentity> getlist(){
		return repo.findAll();
	}

}
