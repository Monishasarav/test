package com.myapp.StudentMarkSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MsDao {
	@Autowired
	MsRepo repo;
	
	public String display(List<MarkSheet> a) {
		repo.saveAll(a);
		return "saved";
	}

}
