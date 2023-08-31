package com.myapp.employeeBean;

import org.springframework.context.annotation.Profile;

@Profile("dev")

public class Confi {

public void dev() {
	System.out.println("this is development team");
}

}
