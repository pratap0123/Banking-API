package com.pd.service;

import java.util.ArrayList;
import java.util.List;

import com.pd.EmployeeDTO;

public class EmployeeService2 {

	List<EmployeeDTO> emplist2=new ArrayList<>();
	
	public List<EmployeeDTO> getEmployees(){
		emplist2.add(new EmployeeDTO(101, "vinod", 25, 10000));
		emplist2.add(new EmployeeDTO(107, "kumar", 35, 20000));
		emplist2.add(new EmployeeDTO(103, "ravi", 15, 5000));
		emplist2.add(new EmployeeDTO(100, "charan", 35, 10000));
		emplist2.add(new EmployeeDTO(100, "rama", 45, 10000));
		emplist2.add(new EmployeeDTO(110, "navi", 55, 30000));
		emplist2.add(new EmployeeDTO(110, "abc", 65, 30000));
		emplist2.add(new EmployeeDTO(110, "dummy", 75, 30000));
		return emplist2;
	}
	
}
