package com.myapp.employeeBean;

//import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class EmployeeScopeOfBeanApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeScopeOfBeanApplication.class, args);
	}
	@Autowired
	ApplicationContext ac;
	
    @Override
    public void run(String... args) throws Exception {
    	// TODO Auto-generated method stub
    	System.out.println("helloemp");
    	EmployeeBean e1=ac.getBean(EmployeeBean.class);
    	System.out.println(e1);
    	EmployeeBean e2=ac.getBean(EmployeeBean.class);
    	e2.setName("abc");
    	System.out.println(e2);
    	EmployeeBean e3=ac.getBean(EmployeeBean.class);
    	System.out.println(e3);
    	
    }
    
   // public EmployeeBean eb() {
    //	return new EmployeeBean();
    //}
    
}
