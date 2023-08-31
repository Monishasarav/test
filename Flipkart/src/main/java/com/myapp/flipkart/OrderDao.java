package com.myapp.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {

@Autowired
OrderRepository repo;

public String display(OrderEntity a) {
	repo.save(a);
	return "saved";
}

public List<Object> read() {
	return repo.read();
}

}
