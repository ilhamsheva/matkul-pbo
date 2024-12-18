// File: Gojek.java
package com.kuliah;

public class Gojek implements Transportasi {
    private int id;
    private double harga;

    @Override
    public void tampil() {
        System.out.println("ID Transportasi: " + id);
        System.out.println("Harga: Rp " + harga);
    }

    @Override
    public void setData() {
        // Set data manually in Main class
    }

    @Override
    public int getId() {
        return id;
    }

    public double getHarga() {
        return harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}