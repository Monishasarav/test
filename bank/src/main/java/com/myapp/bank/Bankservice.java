package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Bankservice {
	@Autowired
	Bankdao dao;
	public String postbank(List<Bank> a) {
		return dao.postbank(a);
	}
    public int getbank(String branch){
    	return dao.getbank(branch);
    }
}
