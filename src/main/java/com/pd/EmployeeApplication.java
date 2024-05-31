package com.pd;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pd.service.EmployeeService;
import com.pd.service.EmployeeService2;

@SpringBootApplication
public class EmployeeApplication {
	@Autowired
	private EmployeeService service;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
//		System.out.println("**************Employee Operation Started*****************");
		
		
		
	}
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Questions+++++++++++++++++++++++++++++++++++++++++");
//		
//	}
//	
	
	
//	@Override
//	public void run(String... args) throws Exception {
//		service.getEmployees();
//		EmployeeService2 service=new EmployeeService2();
//		List<EmployeeDTO> employees = service.getEmployees();
//		System.out.println("3rd======================");
//		 System.out.println("=======================================================");
//		List<EmployeeDTO> collect = employees.stream()
//				.sorted(Comparator.comparing(EmployeeDTO::getSalary).reversed())
//				.collect(Collectors.toList());
//
//
//		for(EmployeeDTO e:collect) {
//			System.out.println(e);
//		}
		
		//group by Sal
//		Map<Double, List<EmployeeDTO>> collect2 = employees.stream()
//		.collect(Collectors.groupingBy(EmployeeDTO::getSalary));
//		
//		//displaying
//		for(Map.Entry<Double,List<EmployeeDTO>> e:collect2.entrySet()) {
//			System.out.println(e);
//		}
		
		//sorting the map based on Key [D.O] and getting 3rd highest
//		 System.out.println("=======================================================");
//	       LinkedHashMap<Double, List<EmployeeDTO>> collect3 = collect2.entrySet()
//	                .stream()
//	                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//	                .skip(2).limit(1)
//	                .collect(
//	                        Collectors
//	                        .toMap(Map.Entry::getKey, 
//	                        		Map.Entry::getValue,
//	                        		(oldValue, newValue) -> oldValue, LinkedHashMap::new)
//	                );
	       
	  
	       //displaying
	       
//	       for(Map.Entry<Double,List<EmployeeDTO>> e:collect3.entrySet()) {
//				System.out.println(e);
//			}
	       
//	       System.out.println("=======================================================");
	       
	       
//	       List<EmployeeDTO> entryList = new ArrayList<>();
	  
//	       List<Map.Entry<Double, List<EmployeeDTO>>> entryList = new ArrayList<>();
//	        for (Map.Entry<Double,List<EmployeeDTO>> entry : collect3.entrySet()) {
//	            entryList.add(entry);
//	        }
//	        
//	        System.out.println("List of Map Entries:");
//	        for (Map.Entry<Double, List<EmployeeDTO>> entry : entryList) {
//	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//	        }
//	       
	       
//	       System.out.println("=======================================================");
//	       
//	       
//	       
//	       List<EmployeeDTO> employeeList = new ArrayList<>();
//	        employeeList.add(new EmployeeDTO(101, "vinod", 25, 10000));
//	        employeeList.add(new EmployeeDTO(107, "kumar", 35, 20000));
//	        employeeList.add(new EmployeeDTO(103, "ravi", 15, 5000));
//	        employeeList.add(new EmployeeDTO(100, "charan", 35, 10000));
//	        employeeList.add(new EmployeeDTO(100, "rama", 45, 10000));
//	        employeeList.add(new EmployeeDTO(110, "navi", 55, 30000));
//	        employeeList.add(new EmployeeDTO(110, "abc", 65, 30000));
//	        employeeList.add(new EmployeeDTO(110, "dummy", 75, 30000));

	        // Find the name of the 3rd highest salaried senior employee by age
//	        String nameOfThirdHighestSalariedSenior = employeeList.stream()
//	                .sorted(Comparator.comparingInt(EmployeeDTO::getAge).reversed())
//	                .collect(Collectors.groupingBy(EmployeeDTO::getSalary)) // Group by salary
//	                .keySet().stream() // Get set of distinct salaries
//	                .skip(2) // Skip the first two unique salaries
//	                .findFirst()
//	                .flatMap(thirdHighestSalary ->
//	                        employeeList.stream()
//	                                .filter(employee -> employee.getSalary() == thirdHighestSalary)
//	                                .map(EmployeeDTO::getName)
//	                                .findFirst())
//	                .orElse(null);
//	        
//	        System.out.println(nameOfThirdHighestSalariedSenior);
			//group by Sal
//			Map<Double, List<EmployeeDTO>> map = employees.stream()
//			.collect(Collectors.groupingBy(EmployeeDTO::getSalary))
//			.entrySet()
//            .stream()
//            .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
//            .skip(2).limit(1)
//            .collect(
//                    Collectors
//                    .toMap(Map.Entry::getKey, 
//                    		Map.Entry::getValue,
//                    		(oldValue, newValue) -> oldValue, LinkedHashMap::new)
//            );
//			
//			for(Map.Entry<Double,List<EmployeeDTO>> e:map.entrySet()) {
//				System.out.println(e);
//				System.out.println(e.getKey());
//				System.out.println(e.getValue());
//				List<EmployeeDTO> emp = e.getValue();
//				EmployeeDTO employeeDTO = emp.stream().sorted(Comparator.comparing(EmployeeDTO::getAge).reversed())
//						.findFirst().get();
//				System.out.println(employeeDTO.getName());
//			}
//	
//			
//			System.out.println("==============================================");
	       
//	}

}
