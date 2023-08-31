package com.myapp.value;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
@Autowired
Value1 v;

@GetMapping(value="/getans")
public String getans() {
	return v.getName();
	
}

}
