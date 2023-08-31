package com.myapp.bank;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;

public interface Bankrepository extends JpaRepository<Bank,Integer> {
	
@Query(value="select * from bank_details where branch=?",nativeQuery=true)
public int getbank(String branch);
	

}
