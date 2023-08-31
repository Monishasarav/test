package com.myapp.gst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.myapp.employee.Employee;

@RestController
@RequestMapping(value = "/gst")
public class GstController {

	@Autowired
	GstService ser;

	@PostMapping(value = "/gstpost")
	public String gstpost(@RequestBody List<GstEntity> a) {
		return ser.gstpost(a);
	}

	@GetMapping(value = "/getpercent/{hsncode}")
	public int getpercent(@PathVariable int hsncode) {
		return ser.getpercent(hsncode);
	}

}
