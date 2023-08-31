package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Bankdao {
	@Autowired
	Bankrepository repo;
	public String postbank(List<Bank> a) {
		repo.saveAll(a);
		return "updated";
	}
	public int getbank(String branch){
		return repo.getbank(branch);
	}

}
