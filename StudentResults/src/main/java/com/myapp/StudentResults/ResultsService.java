package com.myapp.StudentResults;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.yaml.snakeyaml.error.Mark;
//import org.yaml.snakeyaml.error.Mark;

//import com.myapp.userstory.Product;

@Service
public class ResultsService {

	@Autowired
	ResultsDao dao;

	public String display(List<Results> a) {
		return dao.display(a);
	}

	public List<Results> readvalues() {
		return dao.readvalues();
	}
	public String update(List<Results> a) {
		return dao.update(a);
	}
	public String delete(List<Results> a) {
		return dao.delete(a);
	}

}
