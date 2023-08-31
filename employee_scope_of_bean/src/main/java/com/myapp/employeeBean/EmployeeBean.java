package com.myapp.employeeBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class EmployeeBean {
@Value("${hello}")	
public String name;

public EmployeeBean() {
	System.out.println("bean is created");
}

public String getName() {
	return name;
}
@Value("monisha")
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "EmployeeBean [name=" + name + "]";
}


}
