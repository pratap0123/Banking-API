package com.pd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pd.dto.Employee;
import com.pd.dto.EmployeeDetails;
import com.pd.service.EmployeeService;
import com.pd.service.EmployeeService2;

@SpringBootApplication
public class EmployeeApplication2 implements CommandLineRunner{
	@Autowired
	private EmployeeService service;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication2.class, args);
		System.out.println("**************Employee Operation Started*****************");
		
		
		
	}
	@Override
	public void run(String... args) throws Exception {
		
		//OPPS
//		StudentService student=new StudentService();
//		student.getData();
		
		
		
		EmployeeService2 service=new EmployeeService2();
		List<EmployeeDTO> employees = service.getEmployees();
		System.out.println("++++++++++++++++++++++++++++++++Employees DATA++++++++++++++++++++++++++++++++++++++++++++++");
		for(EmployeeDTO emp:employees) {
			System.out.println(emp);
		}
		
		//Group a map based on salary
		
		
		
		
		 Map<Integer, String> studentMap = new HashMap<>();
	        // Add student data to the map
	        studentMap.put(1001, "John Smith");
	        studentMap.put(1020, "Emily Johnson");
	        studentMap.put(1003, "Michael Davis");
	        studentMap.put(1000, "Emma Wilson");
	        System.out.println("================Employees  Map DATA=======================");
	        for(Map.Entry<Integer, String> entry:studentMap.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	        
	        
	      //sorted a Map based on key
	        System.out.println("================Employees sorted Map KEYS===============");
	        
	        Map<Integer, String> sortedMap = studentMap.entrySet().stream()
	        		.sorted(Map.Entry.comparingByKey())
	        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	        for(Map.Entry<Integer, String> entry:sortedMap.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	        
	      //sorted a Map based on value
	        System.out.println("================Employees sorted Map VALUES===============");
	        
	       LinkedHashMap<Integer, String> collect = studentMap.entrySet().stream()
	        		.sorted(Map.Entry.comparingByValue())
	        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	        				(oldVal,newVal)->oldVal,LinkedHashMap::new));
	     
	        for(Map.Entry<Integer, String> entry:collect.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	        
	        System.out.println("++++++++++Employees New  DATA++++++++++++++++++++++");
	        Map<Integer, Employee> employeeMap = new HashMap<>();

	       employeeMap.put(1, new Employee(1000, "Pratap", "HYD", "TRG", 34000.00));
	       employeeMap.put(14, new Employee(1009, "Alok", "HYD", "TRG", 74000.00));
	       employeeMap.put(12, new Employee(1003, "Deepika", "CHN", "IAM", 24000.00));
	       employeeMap.put(7, new Employee(1007, "Dev", "CHN", "IAM", 30000.00));
	       employeeMap.put(17, new Employee(1043, "Purvi", "CHN", "ARCHER", 4000.00));
	       employeeMap.put(70, new Employee(1067, "Aruna", "HYD", "TRG", 10000.00));
	       
	       for(Map.Entry<Integer, Employee> entry:employeeMap.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	       //sort map based on values[Salary]
	       System.out.println("---------------------------------------------------");
	       LinkedHashMap<Integer, Employee> collect2 = employeeMap.entrySet().stream()
	       			.sorted(Map.Entry.comparingByValue
	       					(Comparator.comparing(Employee::getSal).reversed()))
	       			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	       					(oldVal,newVal)->oldVal,LinkedHashMap::new));
	       
	       for(Map.Entry<Integer, Employee> entry:collect2.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	       System.out.println("---------------------------------------------------");
	       System.out.println("Employee Object as Keys");
	       
	       Map<Employee, EmployeeDetails> emp=new HashMap<>();
	       List<String> phon=new ArrayList<>();
	       phon.add("6655443344");
	       phon.add("9988443311");
	       List<String> address=new ArrayList<>();
	       address.add("Permannet::TRUE");
	       address.add("Temporary::TRUE");
	       emp.put(new Employee(10, "Pratap Dutta", "HYD", "TRG", 20000.00), 
	    		   new EmployeeDetails(1000, "Bhadrak", "Odisha", phon, true, true, address));
	       
	       
	       List<String> phon2=new ArrayList<>();
	       phon2.add("1111111111");
	       phon2.add("2222222222");
	       List<String> address2=new ArrayList<>();
	       address2.add("Permannet::TRUE");
	       address2.add("Temporary::FALSE");
	       emp.put(new Employee(13, "Alok", "CHN", "IAM", 70000.00), 
	    		   new EmployeeDetails(1030, "Bhadrak", "Odisha", phon2, true, true, address2));
	       
	       
	       List<String> phon3=new ArrayList<>();
	       phon3.add("9999999999");
	       phon3.add("8888888888");
	       List<String> address3=new ArrayList<>();
	       address3.add("Permannet::TRUE");
	       address3.add("Temporary::FALSE");
	       emp.put(new Employee(14, "Dev", "HYD", "IAM", 40000.00), 
	    		   new EmployeeDetails(1020, "BLSR", "Odisha", phon3, true, true, address3));
	       
	       
	       List<String> phon4=new ArrayList<>();
	       phon4.add("777777777");
	       phon4.add("444444444");
	       List<String> address4=new ArrayList<>();
	       address4.add("Permannet::TRUE");
	       address4.add("Temporary::FALSE");
	       emp.put(new Employee(17, "Deepika", "CHN", "ARCHER", 90000.00), 
	    		   new EmployeeDetails(1010, "CTC", "Odisha", phon4, true, true, address4));
	       
	       
	       for(Map.Entry<Employee, EmployeeDetails> entry:emp.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	       
	       System.out.println("--------------------------------------------------");
	       System.out.println("---------------Values----------------------");
	       LinkedHashMap<Employee, EmployeeDetails> collect3 = emp.entrySet().stream()
	       	.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed()))
	       	.collect(Collectors.toMap(
	       			Map.Entry::getKey, Map.Entry::getValue,
	       			(oldVal,newVal)->oldVal,LinkedHashMap::new));
	       
	       
	       for(Map.Entry<Employee, EmployeeDetails> entry:collect3.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	       System.out.println("***************************************");
	     
	       //Map to list
	       ArrayList<Employee> collect4 = employeeMap.entrySet().stream()
	       		.collect(ArrayList<Employee>::new, 
	       				(al,e)->e.getValue(), ArrayList<Employee>::addAll);
	       
	       for(Employee e:collect4) {
	    	   System.out.println(e);
	       }
	       
	       System.out.println("===================================");
	       List<Employee> listEmp = employeeMap.values().stream()
	       		.collect(Collectors.toList());
	       for(Employee e:listEmp) {
	    	   System.out.println(e);
	       }
	       
	       //Group the EmpList by Deapt
	       System.out.println("Group emp by Dept");
	       Map<String, List<Employee>> empMap = listEmp.stream()
	    		   .collect(Collectors.groupingBy(Employee::getDept));
	       
	       
	       for(Map.Entry<String, List<Employee>> entry:empMap.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	     //Group the EmpList by Deapt and Sort keys
	       System.out.println("Group emp by Dept and sort");
	       
	       Map<String, List<Employee>> collect5 = listEmp.stream()
		   .collect(Collectors.groupingBy(Employee::getDept))
		   .entrySet().stream()
		   .sorted(Map.Entry.comparingByKey())
		   .collect(LinkedHashMap::new, 
				   (map,e)->map.put(e.getKey(), e.getValue()), LinkedHashMap::putAll);
	       System.out.println("===================================");
	       for(Map.Entry<String, List<Employee>> entry:collect5.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	       
	       //Group the EmpList by Deapt and Sort Employees in each group
	       System.out.println("Group the EmpList by Deapt and Sort Employees in each group");
	       
	       
	       LinkedHashMap<Object, Object> collect6 = listEmp.stream()
	    		   .collect(Collectors.groupingBy(Employee::getDept))
	    		   .entrySet().stream()
	    		   .collect(LinkedHashMap::new, 
	    				   (map,e)->map.put(e.getKey(), 
	    						   e.getValue()
	    						   .stream()
	    						   .sorted(Comparator.comparing(Employee::getSal))),
	    				   LinkedHashMap::putAll);
	       
	       System.out.println("============================================");
	       
	       System.out.println("Group the EmpList by Deapt and Sort Employees in each group");
	       Map<String, List<Employee>> collect7 = listEmp.stream()
		   			.collect(Collectors.groupingBy(Employee::getDept))
		   			.entrySet().stream()
		   			.collect(Collectors.toMap(
		   					Map.Entry::getKey,
		   					entry->entry.getValue()
		   					.stream().sorted(Comparator.comparing(Employee::getSal))
		   					.collect(Collectors.toList())));
	       
	       for(Map.Entry<String, List<Employee>> entry:collect7.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	       System.out.println("Sort the Grouping of EmpList by Deapt and Sort Employees in each group");
	       System.out.println("============================================");
	       
	      Map<String, List<Employee>> collect8 = listEmp.stream()
  			.collect(Collectors.groupingBy(Employee::getDept))
  			.entrySet().
  			stream()
  			.collect(Collectors.toMap(
  					Map.Entry::getKey,
  					entry->entry.getValue()
  					.stream().sorted(Comparator.comparing(Employee::getSal))
  					.collect(Collectors.toList())))
  			.entrySet().stream()
  			.sorted(Map.Entry.comparingByKey())
  			.collect(
  					LinkedHashMap::new, 
  					(map,e)->map.put(e.getKey(), e.getValue()),
  					LinkedHashMap::putAll);
	       
	       for(Map.Entry<String, List<Employee>> entry:collect8.entrySet()) {
	        	
	        	System.out.println(entry.getKey()+":::" +entry.getValue());
	        }
	       
	       System.out.println("Group the Employees and show like A2B4C5");
	       System.out.println("============================================");
	       
	       StringBuilder sb=new StringBuilder();
	       listEmp.stream()
 				.collect(Collectors.groupingBy(Employee::getDept,
 						Collectors.counting()))
 				.forEach((k,v)->{
 					sb.append(k);
 					sb.append(v);
 				});
	       System.out.println(sb);
	       
	       
	       System.out.println("-----------------Coforge---------------");
	       System.out.println("name the Emp 3rd highest sal which is most senior in age ");
	       EmployeeService2 service2=new EmployeeService2();
	       List<EmployeeDTO> employees2 = service2.getEmployees();
	       for(EmployeeDTO e:employees2) {
	    	   System.out.println(e);
	       }
	       
	       System.out.println("-----------------Coforge---------------");
	       Map<Double, List<Employee>> newMap = listEmp.stream()
	    		   .collect(Collectors.groupingBy(Employee::getSal))
	    		   .entrySet().stream()
	    		   .sorted(Map.Entry.comparingByKey())
	    		   .collect(LinkedHashMap::new, 
	    				   (map,e)->map.put(e.getKey(), e.getValue()), LinkedHashMap::putAll);
	       
	       
//	       for (Entry<Double, List<EmployeeDTO>> entry : entries) {
//	            Double key = entry.getKey();
//	            List<EmployeeDTO> emps = entry.getValue();
//
//	            System.out.println("Key: " + key);
//	            for (EmployeeDTO employee : emps) {
//	                System.out.println("  " + employee);
//	            }
//	        }
	       		
	       
	       
	       System.out.println("=====================================");
	       System.out.println("Duplicate chars");
	       
	       String name="Dutta";
	       System.out.println(name);
	       name.chars().mapToObj((c)->(char)c)
	       			.collect(
	       					Collectors.groupingBy(Function.identity(),Collectors.counting()))
//	       			Collectors.groupingBy(Function.identity(),Collectors.counting()))
	       			.entrySet()
	       			.stream()
	       			.filter(entry->entry.getValue()>1)
	       			.forEach(entry->System.out.println(entry.getKey()+"="+entry.getValue()));
	        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	        
	        
		
	}

}
