package com.kuliah;

public class Bayar extends Gojek {
    private double jarak;
    private double total;
    private String nama;

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("Jarak: " + jarak + " km");
        System.out.println("Total Bayar: Rp " + total);
    }

    @Override
    public void setData() {
        // Set data manually in Main class
    }

    public void setData(String nama, double jarak) {
        this.nama = nama;
        this.jarak = jarak;
        this.total = jarak * getHarga();
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public double getTotal() {
        return total;
    }
}
