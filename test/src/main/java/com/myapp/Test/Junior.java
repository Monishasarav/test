package com.myapp.Test;

import org.springframework.context.annotation.Primary;



@Primary
public class Junior implements Student  {

public String getmsg() {
	return "junior";
}

}
