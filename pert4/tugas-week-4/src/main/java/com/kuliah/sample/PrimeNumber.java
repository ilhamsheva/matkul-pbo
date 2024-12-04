package com.kuliah.sample;

public class PrimeNumber {
    // Constructor
    public PrimeNumber() {
        // Inisialisasi jika diperlukan
    }

    // Metode untuk memeriksa bilangan prima
    public boolean isPrime(int angka) {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= angka / 2; i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}