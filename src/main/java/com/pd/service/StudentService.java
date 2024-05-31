package com.pd.service;

import com.pd.dto.Address;

public class StudentService {
	
	public void getData() {
		System.out.println("++++++++++++++++++++++Student Data++++++++++++++++++++++++++");
//		Student s=new Student("Pratap",1000);
		
		
		Address add=new Address("pratap", 1000, "Bhadrak");
		String display = add.display();
		System.out.println(display);
	}

}
