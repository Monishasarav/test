package com.myapp.qualifier;

import org.springframework.stereotype.Service;

//import org.springframework.stereotype.Service;
@Service("bus")
public class Bus extends vehicle {

public String getmsg() {
	return "bus";
}
}
