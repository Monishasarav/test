package com.myapp.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.vehicle.entity.Car;

public interface CarRepository extends JpaRepository<Car,Integer> {

}
