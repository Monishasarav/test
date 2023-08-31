package com.myapp.flipkart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/order")
public class OrderController {

@Autowired
OrderService ser;

@PostMapping(value="/display")
public String dispaly(@RequestBody OrderEntity a) {
	return ser.display(a);
}
@GetMapping(value="/read")
public List<Object> read() {
	return ser.read();
}


}
