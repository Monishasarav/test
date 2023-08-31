package com.myapp.product;

import org.springframework.context.annotation.Profile;

@Profile("dev")
public class Confi {
	
public void dev() {
	System.out.println("dev team");
}
public void test() {
	System.out.println("test team");
}
public void prod() {
	System.out.println("prod team");
}

}
