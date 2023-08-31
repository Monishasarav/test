package com.myapp.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.myapp.vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike,Integer> {
	@Query(value="select * FROM bike_details where id>=?",nativeQuery=true)
	public List<Bike> idofbike(int id);
	
	@Query(value="select brand FROM bike_details where model>?",nativeQuery=true)
	public List<String> changecolor(int model);

}
