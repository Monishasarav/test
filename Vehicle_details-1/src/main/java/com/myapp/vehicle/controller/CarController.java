package com.myapp.vehicle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.myapp.vehicle.entity.Car;
import com.myapp.vehicle.entity.Employee;
import com.myapp.vehicle.service.CarService;

@RestController
@RequestMapping(value="/car")
public class CarController {
     @GetMapping(value="/get")
     
    public List<Employee> setempviacar() {
        	
    	String url="http://localhost:9000/employee/getlist";
    	ResponseEntity<List<Employee>> res=rest.exchange(url,HttpMethod.GET,null,new ParameterizedTypeReference<List<Employee>>(){});
           List<Employee> val=res.getBody();
           return val;
    }
     @GetMapping(value="/getid")
     public List<Employee> setid(@PathVariable int id) {
    	 String url="http://localhost:9000/employee/getemployee/";
    	 ResponseEntity<String> res=rest.exchange(url+id,HttpMethod.GET,null,new ParameterizedTypeReference<List<Employee>>(){});
     
     }

	@Autowired
	CarService carser;
	@PostMapping(value="/add")
	public String addcar(@RequestBody List<Car> s) {
		return carser.addcar(s);
	}
	@GetMapping(value="/read/{id}")
	public Car readcar(@PathVariable int id) {
		return carser.readcar(id);
	}
	@PutMapping(value="/update")
	public String updatecar(@RequestBody List<Car> s) {
		return carser.updatecar(s);
	}
	@DeleteMapping(value="/del/{id}")
	public String delcar(@PathVariable int id) {
		return carser.delcar(id);
	}
	
}
