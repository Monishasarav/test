package com.myapp.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Customerrepo extends JpaRepository<Customer,Integer> {
@Query(value="select * from bank_details",nativeQuery=true)
public List<Customer> getvalue();
//@Query(value="select name from customer_details",nativeQuery=true)
//public String putvalue(int id,String name);
}
