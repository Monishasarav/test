package com.myapp.product;

import org.springframework.data.jpa.repository.JpaRepository;



public interface Productrepository extends JpaRepository<Productentity,Integer> {

}
