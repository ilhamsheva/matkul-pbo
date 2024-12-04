package com.kuliah.sample;

public class Countdown {
    // Constructor
    public Countdown() {
        // Inisialisasi jika diperlukan
    }

    // Metode untuk memulai hitungan mundur
    public void startCountdown(int start) {
        while (start > 0) {
            System.out.println("Hitungan mundur: " + start);
            start--;
        }
    }
}