package com.kuliah.sample;

import java.util.ArrayList;
import java.util.List;

public class Seller {
    private List<Item> items;

    // Constructor
    public Seller() {
        items = new ArrayList<>();
    }

    // Method to add an item to the seller's list
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to calculate total revenue if all items are sold
    public int getTotalRevenue() {
        int totalRevenue = 0;
        for (Item item : items) {
            totalRevenue += item.getTotalPrice();
        }
        return totalRevenue;
    }

    // Display all items' details
    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getDetails());
        }
    }
}