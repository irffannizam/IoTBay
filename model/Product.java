package model;

public class Product {
    //member attributes
    private String productID;
    private String productName;
    private String description;
    private String status;
    private int quantity;

    //constructor
    public Product(String productName, String description, String status, int quantity) {
        this.productName = productName;
        this.description = description;
        this.status = status;
        this.quantity = quantity;
    }

    //accessors and mutators
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
