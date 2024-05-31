package com.pd.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pd.dto.Employee;
import com.pd.helper.EmployeeHelper;

@Service
public class EmployeeService {

	List<Employee> employees=new ArrayList<>();
	@Autowired
	private EmployeeHelper helper;
	
	public void getEmployees() {
		System.out.println("*************************************************");
		employees = helper.getAllemployees();
		for(Employee employeee:employees) {
			System.out.println(employeee);
		}
		
		//input:abcdaba  output:a3b2c1d1
		StringBuilder sb=new StringBuilder();
		Map<String, Long> groupDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		groupDept.forEach((key,val)->{
			
			System.out.println(key+"::"+val);
			sb.append(key);
			sb.append(val);
		});
		System.out.println("GroupMap:::"+sb);
		//input:abcdaba  output:c1d2b3a4
		System.out.println("GroupMap output:c1d2b3a4:::");
		//dept wise
		System.out.println("GroupMap Dept Wise:::=================================");
		Map<String,List<Employee>> groupDeptWise = employees.stream().collect(
				Collectors.groupingBy(Employee::getDept));
		groupDeptWise.forEach((key,val)->{
			
			System.out.println(key+"::"+val);
		});
		
		//dept wise and max sal
		System.out.println("================================");
		Map<String, Optional<Employee>> collect = employees.stream().collect(
				Collectors.groupingBy(Employee::getDept,
						Collectors.maxBy(Comparator.comparing(Employee::getSal))));
		collect.forEach((k,v)->{
			System.out.println(k+":::"+v);
		});
	}
	
	
	
}
