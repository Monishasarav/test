package com.myapp.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

//import com.myapp.employee.Employee;

@Repository
public class GstDao {
	@Autowired
	GstRepository repo;
	public String gstpost(@RequestBody List<GstEntity> a) {
		repo.saveAll(a);
		return "updated";
	}
	public int getpercent(int hsncode) {
		return repo.getpercent(hsncode);

	}


}
