package com.myapp.vehicle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myapp.vehicle.entity.Bike;
import com.myapp.vehicle.repository.BikeRepository;

@Repository
public class BikeDao {
	
@Autowired
BikeRepository bikerepo;
	
public String addbike(List<Bike> s){
	bikerepo.saveAll(s);
	return " Updated Successfully";
}
public List<Bike> findall(){
	return bikerepo.findAll();
}
public List<Bike> idofbike(int id){
	return bikerepo.idofbike(id);
}
public List<String> changecolor(int model){
	return bikerepo.changecolor(model);
}

}
