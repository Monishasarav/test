package com.myapp.productDetails;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProController {
	
//@LoadBalanced 
//to balance the request 
//@Bean
@GetMapping(value="/read")
public String read() {
	return "this is product";
}


}
