package com.pd;

public class EmployeeDTO {
	private Integer id;
	private String name;
	private Integer age;
	private Double salary;
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeDTO(Integer id, String name, Integer age, int i) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = (double) i;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
}
