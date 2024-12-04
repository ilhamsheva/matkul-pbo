package com.kuliah.sample;

public class Item {
    private String name;
    private int stock;
    private int pricePerItem;
    private int totalPrice;

    // Setter method to set item details
    public void setDetails(String name, int stock, int pricePerItem) {
        this.name = name;
        this.stock = stock;
        this.pricePerItem = pricePerItem;
        calculateTotalPrice();
    }

    
    // Calculate the total price for the item
    private void calculateTotalPrice() {
        this.totalPrice = this.stock * this.pricePerItem;
    }
    
    // Getter for total price
    public int getTotalPrice() {
        return totalPrice;
    }
    
    // Getter method to get item details
    public String getDetails() {
        return "Name: " + name + ", Stock: " + stock + ", Price per Item: Rp " + pricePerItem + ", Total Price: Rp " + totalPrice;
    }
}