package com.myapp.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	
	@PostMapping(value="/add")
	public String addEmployee(@RequestBody Employee e) throws AgeException,Exception {
		return empser.addEmployee(e);
	}
	
	
	@PostMapping(value="/abc")
	
	public String listemp(@RequestBody List<Employee> e) {
		return empser.listemp(e);
	}
	@GetMapping(value="/getlist")
	public List<Employee> getlist() {
		return empser.getlist();
	}
	@PutMapping(value="/update")
	public String updateemp(@RequestBody Employee e) {
		return empser.updateemp(e);
	}
	@DeleteMapping(value="/del/{id}")
	public String delemp(@PathVariable int id) {
		return empser.delemp(id);
	}
	@DeleteMapping(value="/dellist")
	public String dellist() {
		return empser.dellist();
	}
	@GetMapping(value="/getbyname/{name}")
	public List<Employee> getbyname(@PathVariable String name)throws NameNotFoundException{
		return empser.getbyname(name);
	}
	@GetMapping(value="/getbyAge/{age}")
	public List<Employee> getAllAge(@PathVariable int age){
		return empser.getAllAge(age);
	}
	@GetMapping(value="/putbysal")
	public List<Employee> putsal(@RequestBody List<Employee> d){
		return empser.putsal(d);
	}
	@GetMapping(value="/getgen/{gender}")
	public List<String> getgender(@PathVariable String gender){
		return empser.getgender(gender);
	}
	@GetMapping(value="/getbyempsal/{salary}")
	public List<Employee> getEmployeeBySalary(@PathVariable int salary){
		return empser.getEmployeeBySalary(salary);
		
	}
	@GetMapping(value="/getAgeByAsc")
	public List<Employee> getAgeByAsc(){
		return empser.getAgeByAsc();
	}
	
}
