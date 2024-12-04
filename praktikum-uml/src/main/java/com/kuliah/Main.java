package com.kuliah;

import com.kuliah.sample.*;

public class Main {
    public static void main(String[] args) {
        // Create items
        Item ballpoint = new Item();
        ballpoint.setDetails("Ballpoint", 10, 2000);

        Item pencil = new Item();
        pencil.setDetails("Pencil", 10, 1000);

        Item eraser = new Item();
        eraser.setDetails("Eraser", 10, 500);

        // Create seller and add items
        Seller seller = new Seller();
        seller.addItem(ballpoint);
        seller.addItem(pencil);
        seller.addItem(eraser);

        // Display each item's details
        System.out.println("Items Details:");
        seller.displayItems();

        // Display total revenue if all items are sold
        System.out.println("Total Revenue if all items are sold: Rp " + seller.getTotalRevenue());
    }
}
