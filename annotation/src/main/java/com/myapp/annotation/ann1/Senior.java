package com.myapp.annotation.ann1;

import org.springframework.context.annotation.Primary;

@Primary
public class Senior implements student {
	
	public String stud() {
		return "senior";
	}


}
