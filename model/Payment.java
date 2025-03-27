package model;

public class Payment {
    //member attributes
    private static int idCounter = 0;
    private int paymentID;
    private double amount;
    private String paymentDate;
    private String paymentType;

    //constructor   
    public Payment(double amount, String paymentDate, String paymentType) {
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentType = paymentType;
    }

    //method to assign 6 digit ID value to each object
    private int generateID(){
        int cur = idCounter++;
        String str = Integer.toString(cur);
        while(str.length() < 6){
            str = "0" + str;
        }
        return 0;
    }

    //accessors and mutators
    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}