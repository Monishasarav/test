package com.myapp.employee;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empdao;

	public String addEmployee(Employee e) throws AgeException, Exception {
		//try {
			if (e.getAge() < 18) {
				throw new AgeException("age below 18");
			} else {

				return empdao.addEmployee(e);
			}
		//} catch (AgeException ae) {
			//return ae.getMessage();
		}
	//}

	

	public String listemp(List<Employee> e) {
		return empdao.listemp(e);
	}

	public List<Employee> getlist() {
		return empdao.getlist();
	}

	public String updateemp(Employee e) {
		return empdao.updateemp(e);
	}

	public String delemp(int id) {
		return empdao.delemp(id);
	}

	public String dellist() {
		return empdao.dellist();
	}

	public List<Employee> getbyname(String name)throws NameNotFoundException{
		//List<Employee> emp2 = empdao.setAllemp();
		List<Employee> a=empdao.getlist();
		List<Employee> employeebyname=a.stream().filter(x->x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
		if(employeebyname.isEmpty()) {
			throw new NameNotFoundException("no data in this name");
		}
		else {
	
			return employeebyname;
			//return emp2.stream().filter(x -> x.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	}}

	public List<Employee> getAllAge(int age) {
		List<Employee> emp1 = empdao.setAllemp();
		return emp1.stream().filter(y -> y.getAge() == age).collect(Collectors.toList());
	}

	public List<Employee> putsal(List<Employee> d) {
		List<Employee> emp3 = empdao.setAllemp();
		return emp3.stream().map(y -> {
			if (y.getAge() >= 30 && y.getAge() < 35) {
				y.setSalary(y.getSalary() + y.getSalary() * 10 / 100);
				return y;
			} else if (y.getAge() >= 35 && y.getAge() < 40) {

				y.setSalary(y.getSalary() + y.getSalary() * 15 / 100);
				return y;
			} else if (y.getAge() >= 40 && y.getAge() < 50) {
				y.setSalary(y.getSalary() + y.getSalary() * 20 / 100);

				return y;
			}
			return y;
		}).collect(Collectors.toList());

	}

	public List<String> getgender(String gender) {
		List<Employee> gen = empdao.setAllemp();
		return gen.stream().filter(x -> x.getGender().equalsIgnoreCase("female")).map(y -> y.getName())
				.collect(Collectors.toList());
	}

	public List<Employee> getEmployeeBySalary(int salary) {
		// List<Employee> sal=empdao.setAllemp();
		return empdao.getEmployeeBySalary(salary);
	}

	public List<Employee> getAgeByAsc() {
		return empdao.getAgeByAsc();
	}

}
