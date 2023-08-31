package com.myapp.electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Electronics")
public class ElectronicsController {

	@Autowired
	ElectronicsService ser;

	@PostMapping(value = "/display")
	public String display(@RequestBody List<Electronics> a) {
		return ser.display(a);
	}

	@PutMapping(value = "/update/{id}")
	public String update(@RequestBody List<Electronics> a,@PathVariable int id) {
		return ser.update(a,id);
	}

	@PatchMapping(value = "/patch/{id}")
	public String patch(@RequestBody List<Electronics> a,@PathVariable int id) {
		return ser.patch(a,id);
	}
}
