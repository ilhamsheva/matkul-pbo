package com.kuliah.sample;

public class Balok
{
    // fungsi untuk menghitung volume balok
    public static int getVolume( int panjang, int lebar, int tinggi )
    {
        return panjang * lebar * tinggi;
    }

    // fungsi untuk menghitung luas permukaan balok
    public static int getLuasPermukaan( int panjang, int lebar, int tinggi )
    {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}