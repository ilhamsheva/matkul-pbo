package com.kuliah.parent;

public abstract class Kendaraan {
    protected String nama;
    protected String tipe;
    protected int kapasitas;
    protected double hargaSewaPerHari;

    public Kendaraan(String nama, String tipe, int kapasitas, double hargaSewaPerHari) {
        this.nama = nama;
        this.tipe = tipe;
        this.kapasitas = kapasitas;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    // Metode abstrak untuk menghitung harga sewa
    public abstract double hitungHargaSewa(int jumlahHari);

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public String getTipe() {
        return tipe;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public double getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }
}
