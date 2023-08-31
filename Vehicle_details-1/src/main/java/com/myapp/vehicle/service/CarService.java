package com.myapp.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.vehicle.dao.CarDao;
import com.myapp.vehicle.entity.Car;



@Service
public class CarService {
	@Autowired
	CarDao cardao;
	public String addcar(List<Car> s) {
		return cardao.addcar(s);
	}
public Car readcar(int id) {
	return cardao.readcar(id);
}
public String updatecar(List<Car> s) {
	return cardao.updatecar(s);
}
public String delcar(int id) {
	return cardao.delcar(id);
}
}
