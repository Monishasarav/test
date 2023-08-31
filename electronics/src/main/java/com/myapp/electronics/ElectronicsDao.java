package com.myapp.electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ElectronicsDao {
	@Autowired
	ElectronicsRepo repo;

	public String display(List<Electronics> a) {
		repo.saveAll(a);
		return "updated";
	}

	//public List<Electronics> findbyid(){
		//return repo.findAll();
	//}

	public String update(List<Electronics> a, int id) {
		repo.saveAll(a);
		return "update done";
	}

	public String patch(List<Electronics> a, int id) {
		repo.saveAll(a);
		return "patch done";
	}
}
