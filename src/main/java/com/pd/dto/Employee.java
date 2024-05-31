package com.pd.dto;

public class Employee {
    private int id;
    private String name;
    private String location;
    private String dept;
    private double sal;

    
    
    public Employee() {
	}

	// Constructor
    public Employee(int id, String name, String location, String dept, double sal) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.dept = dept;
        this.sal = sal;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    // toString method to display the Employee information
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", dept='" + dept + '\'' +
                ", sal=" + sal +
                '}';
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John Doe", "New York", "Engineering", 75000.00);
        System.out.println(emp);
    }
}

