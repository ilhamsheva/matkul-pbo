package com.kuliah.sample;

public class Mobil {
    // Atribute
    public String merk;
    private int tahunProduksi;
    private long harga;

    // Constructor
    public Mobil(String merk, int tahunProduksi, long harga) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    // Getter for tahun produksi
    public int getTahunProduksi() {
        return this.tahunProduksi;
    }

    // Setter for tahun produksi
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    // Getter for harga
    public long getHarga() {
        return this.harga;
    }

    // Setter for harga
    public void setHarga(long hargaBaru) {
        this.harga = hargaBaru;

    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Harga: " + harga);
    }
}