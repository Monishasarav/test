package com.myapp.qualifier;

import org.springframework.stereotype.Service;

@Service("car")
public class Car extends vehicle {

	public String getmsg() {
		return "car";
	}

}
