package com.myapp.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	@Query(value="select * FROM employee_details where salary>=?",nativeQuery=true)
	public List<Employee> getEmployeeBySalary(int salary);
	
   @Query(value="select * FROM employee_details order by age ASC",nativeQuery=true)
   public List<Employee> getAgeByAsc();
   	

}
