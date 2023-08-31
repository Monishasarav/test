package com.myapp.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.vehicle.entity.Bike;
import com.myapp.vehicle.service.BikeService;

@RestController
@RequestMapping(value="/Bike")
public class BikeController {

	@Autowired
	BikeService bikeser;
	
	@PostMapping(value="/add")
	public String addbike(@RequestBody List<Bike> s) {
		return bikeser.addbike(s);
	}
	
	//@GetMapping(value="/get/{id}")
//	public List<Bike> getbike(@PathVariable int id){
	//	return bikeser.getbike(id);
	//}
	@GetMapping(value="/id/{id}")
	public List<Bike> idofbike(@PathVariable int id){
		return bikeser.idofbike(id);
	}
	@GetMapping(value="/change/{model}")
	public List<String> changecolor(@PathVariable int model){
		return bikeser.changecolor(model);
	}
	
}
