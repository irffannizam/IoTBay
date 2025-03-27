package model;

public class Employee {
    
    //member attributes
    private String employeeID;
    private String employeeName;
    private String employeeRole;
    private String phoneNumber;
    private String email;

    //constructor
    public Employee(String employeeName, String employeeRole, String phoneNumber, String email) {
        this.employeeName = employeeName;
        this.employeeRole = employeeRole;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //accessors and mutators
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}