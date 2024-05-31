package com.pd.dto;

public class Address extends Student{

	private String city;

	public Address() {
		System.out.println("Address  Obj...");
	}

	public Address(String name, Integer id,String city) {
		super(name, id);
		this.city=city;
		System.out.println("Address Arg Obj...");
	}
	
	public String display() {
		
		return super.display()+city;
	}
	
}
