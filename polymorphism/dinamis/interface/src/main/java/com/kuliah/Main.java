package com.kuliah;

import com.kuliah.implementation.BujurSangkar;
import com.kuliah.implementation.Lingkaran;
import com.kuliah.implementation.PersegiPanjang;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {
        Lingkaran l = new Lingkaran();
        BujurSangkar b = new BujurSangkar();
        PersegiPanjang p = new PersegiPanjang();

        l.radius = 10;
        System.out.println("Lingkaran dengan radius " + l.radius);
        System.out.println("Luas Lingkaran = " + l.getLuas());
        System.out.println("Keliling Lingkaran = " + l.getKeliling());

        b.sisi = 10;
        System.out.println("Bujur Sangkar dengan sisi " + b.sisi);
        System.out.println("Luas Bujur Sangkar = " + b.getLuas());
        System.out.println("Keliling Bujur Sangkar = " + b.getKeliling());

        p.panjang = 10;
        p.lebar = 5;
        System.out.println("Persegi Panjang dengan panjang " + p.panjang + " dan lebar " + p.lebar);
        System.out.println("Luas Persegi Panjang = " + p.getLuas());
        System.out.println("Keliling Persegi Panjang = " + p.getKeliling());
    }
}
