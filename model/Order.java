package model;

public class Order {
//member attributes
    private String orderID;
    private String orderDesc;
    private String orderStatus;
    private String paymentID;
    private String shippingDetails;

    //constructor
    public Order(String orderDesc, String orderStatus, String paymentID, String shippingDetails) {
        this.orderDesc = orderDesc;
        this.orderStatus = orderStatus;
        this.paymentID = paymentID;
        this.shippingDetails = shippingDetails;
    }

    //accessors and mutators
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(String shippingDetails) {
        this.shippingDetails = shippingDetails;
    }
}
