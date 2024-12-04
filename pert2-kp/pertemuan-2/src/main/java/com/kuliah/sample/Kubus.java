package com.kuliah.sample;

public class Kubus {

    // fungsi untuk menghitung volume kubus
    public static int getVolume( int sisi )
    {
        return sisi * sisi * sisi;
    }

    // fungsi untuk menghitung luas permukaan kubus
    public static int getLuasPermukaan( int sisi )
    {
        return 6 * (sisi * sisi);
    }
}