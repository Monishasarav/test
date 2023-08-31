package com.myapp.StudentResults;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ResultsDao {

	@Autowired
	ResultsRepository repo;

	public String display(List<Results> a) {
		repo.saveAll(a);
		return "updated";
	}
	public List<Results> readvalues(){
		return repo.findAll();
		
	}
	public String update(List<Results> a) {
		repo.saveAll(a);
		return "updated";
	}
	public String delete(List<Results> a) {
		repo.deleteAll(a);
		return "deleted";
	}

}
