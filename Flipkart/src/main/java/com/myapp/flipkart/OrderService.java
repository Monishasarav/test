package com.myapp.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

@Autowired
OrderDao dao;

public String display(OrderEntity a) {
	return dao.display(a);
}
public List<Object> read() {
	return dao.read();
}


}
