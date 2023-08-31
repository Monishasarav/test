package com.myapp.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
@Qualifier("bus")	
@Autowired
vehicle v;

@GetMapping(value="/view")
public String getmsg() {
	return v.getmsg();
}

}
