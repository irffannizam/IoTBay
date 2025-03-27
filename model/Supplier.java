package model;

public class Supplier {
    //member attributes
    private String supplierID;
    private String supplierName;
    private String address;
    private String phoneNumber;
    private String email;
    private String status;

    //constructor
    public Supplier(String supplierName, String address, String phoneNumber, String email, String status) {
        this.supplierName = supplierName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.status = status;
    }

    //accessors and mutators
    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}