package com.myapp.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.PathVariable;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository emprepo;

	public String addEmployee(Employee e) {
		emprepo.save(e);
		return "Successfully Added";

	}

	public Employee getEmployee(int id) {
		return emprepo.findById(id).get();

	}

	public String listemp(List<Employee> e) {
		emprepo.saveAll(e);
		return "Successfully Added";

	}
	public List<Employee> getlist() {
		return emprepo.findAll();

	}
	public String updateemp(Employee e) {
		emprepo.save(e);
		return "updated Successfully";


}
	public String delemp(int id) {
		emprepo.deleteById(id);
		return "Deleted successfully";

	}
	public String dellist() {
		emprepo.deleteAll();
		return "Successfully Deleted";

	}
	public List<Employee> setAllemp(){
		return emprepo.findAll();
	}
	
	public List<Employee> getEmployeeBySalary(int salary){
		//List<Employee> sal=empdao.setAllemp();
		return emprepo.getEmployeeBySalary(salary);
	}
	public List<Employee> getAgeByAsc(){
		return emprepo.getAgeByAsc();
	}
	
	
	}
	
	
