package com.pd.dto;

import java.util.List;

public class EmployeeDetails {
    private int id;
    private String city;
    private String state;
    private List<String> phoneNumbers;
    private boolean isHR;
    private boolean isManager;
    private List<String> addresses;

    public EmployeeDetails(int id, String city, String state, List<String> phoneNumbers,
                           boolean isHR, boolean isManager, List<String> addresses) {
        this.id = id;
        this.city = city;
        this.state = state;
        this.phoneNumbers = phoneNumbers;
        this.isHR = isHR;
        this.isManager = isManager;
        this.addresses = addresses;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public boolean isHR() {
        return isHR;
    }

    public void setHR(boolean HR) {
        isHR = HR;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<String> addresses) {
        this.addresses = addresses;
    }

    // toString() method to display employee details
    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", isHR=" + isHR +
                ", isManager=" + isManager +
                ", addresses=" + addresses +
                '}';
    }
}
