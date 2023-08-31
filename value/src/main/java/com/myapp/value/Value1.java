package com.myapp.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Service;


public class Value1 {

@Value("${hello}")	
private String name;

private int id;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

@Value("hello")
public void setId(int id) {
	this.id = id;
}



}
