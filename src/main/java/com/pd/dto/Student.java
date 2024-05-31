package com.pd.dto;

public class Student {

	private String name;
	private Integer id;
	public Student() {
		System.out.println("Studnet Obj...");
	}
	public Student(String name, Integer id) {
		System.out.println("Studnet Arg Obj...");
		this.name = name;
		this.id = id;
	}
	
	public String display() {
		System.out.println(name+":"+id);
		return name + id;
	}
	
}
