package com.myapp.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;

//import com.myapp.employee.Employee;
//import org.springframework.web.bind.annotation.RequestBody;
@Service
public class GstService {
	
	@Autowired
	GstDao dao;
	public String gstpost( List<GstEntity> a) {
		return dao.gstpost(a);
	}
	
	public int getpercent(int hsncode) {
		return dao.getpercent(hsncode);
	}
}
