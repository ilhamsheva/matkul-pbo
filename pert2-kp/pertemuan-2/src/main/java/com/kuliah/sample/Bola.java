package com.kuliah.sample;

public class Bola {
    // fungsi untuk menghitung volume bola
    public static double getVolume(int jari) {
        return (4.0 / 3.0) * 3.14 * jari * jari * jari; // Gunakan 4.0 dan 3.0 untuk memastikan hasilnya double
    }

    // fungsi untuk menghitung luas permukaan bola
    public static double getLuasPermukaan(int jari) {
        return 4.0 * 3.14 * jari * jari; // Gunakan 4.0 untuk memastikan hasilnya double
    }
}
