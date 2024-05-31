package com.pd.helper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pd.dto.Employee;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EmployeeHelper {

	List<Employee> employees=new ArrayList<>();
	
	public EmployeeHelper() {
		System.out.println("EmployeeHelper Bean got Created");
	}

	@PostConstruct
	public void setUp() {
		System.out.println("Set up");
		employees.add(new Employee(100, "Pratap Dutta", "HYD", "TRG", 56000));
		employees.add(new Employee(101, "Ankit Maurya", "HYD", "IAM", 60000));
		employees.add(new Employee(102, "Manish Sharma", "HYD", "MO", 50000));
		employees.add(new Employee(103, "Rohit Kumar", "CHN", "TRG", 40000));
		employees.add(new Employee(104, "Lokesh Rahul", "CHN", "IAM", 20000));
		employees.add(new Employee(105, "Bipin Kumar", "CHN", "TRG", 90000));
		employees.add(new Employee(106, "Rajesh Das", "CHN", "LOGO", 10000));
		employees.add(new Employee(107, "Alok Naik", "BLR", "TRG", 80000));
		employees.add(new Employee(108, "Deepika Nandi", "BLR", "MO", 70000));
		for(Employee employeee:employees) {
			System.out.println(employeee);
		}
	}
	
	public List<Employee> getAllemployees(){
		
		return employees;
	}
	
	@PreDestroy
	public void detroy() {
		System.out.println("clean up");
		employees.clear();
	}
}
