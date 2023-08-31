package com.myapp.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.vehicle.entity.Bike;
import com.myapp.vehicle.entity.Car;
import com.myapp.vehicle.repository.CarRepository;


@Repository
public class CarDao {
	@Autowired
	CarRepository carrepo;
	public String addcar(List<Car> s) {
		carrepo.saveAll(s);
		return "created succesfully";
	}
	public Car readcar(int id) {
		
		return carrepo.findById(id).get();
	}
	public String updatecar(List<Car> s) {
		carrepo.saveAll(s);
		return "updated successfully";
	}
	public String delcar(int id) {
		carrepo.deleteById(id);
		return "Deleted successfully";
	}
	
}
