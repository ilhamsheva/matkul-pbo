package com.kuliah.sample;

public class Mahasiswa {
    public String nama;
    protected int usia;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, int usia, String jurusan) {
        this.nama = nama;
        this.usia = usia;
        this.jurusan = jurusan;
    }

    // Getter for jurusaan
    public String getJurusan() {
        return jurusan;
    }

    // Setter for jurusan
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Jurusan: " + jurusan);
    }
}