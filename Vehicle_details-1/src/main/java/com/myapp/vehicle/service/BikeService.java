package com.myapp.vehicle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.vehicle.dao.BikeDao;
import com.myapp.vehicle.entity.Bike;

@Service
public class BikeService {

@Autowired
  BikeDao bikedao;


public String addbike( List<Bike> s){
	return bikedao.addbike(s);
}

public List<Bike> idofbike(int id){
	
	return bikedao.idofbike(id);
}
public List<String> changecolor(int model){
	return bikedao.changecolor(model);
}
}
