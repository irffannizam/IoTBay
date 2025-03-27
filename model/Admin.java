package model;

public class Admin {

    //member attributes
    private String adminID;
    private String adminName;
    private String phoneNumber;
    private String email;

    //constructor
    public Admin(String adminName, String phoneNumber, String email) {
        this.adminName = adminName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //accessors and mutators
    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
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