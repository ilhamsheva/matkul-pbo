package com.kuliah;

// Kelas Kalkulator untuk melakukan operasi matematika dasar
public class Kalkulator {
    
    // Metode untuk menambahkan dua angka
    public double tambah(double a, double b) {
        return a + b; // Mengembalikan hasil penjumlahan
    }
    
    // Metode untuk mengurangi dua angka
    public double kurang(double a, double b) {
        return a - b; // Mengembalikan hasil pengurangan
    }
    
    // Metode untuk mengalikan dua angka
    public double kali(double a, double b) {
        return a * b; // Mengembalikan hasil perkalian
    }
    
    // Metode untuk membagi dua angka
    public double bagi(double a, double b) {
        if (b == 0) { // Memeriksa jika pembagi adalah nol
            throw new IllegalArgumentException("Pembagian dengan nol tidak diperbolehkan."); // Menangani pembagian nol
        }
        return a / b; // Mengembalikan hasil pembagian
    }
}
