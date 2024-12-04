package com.kuliah;

// import dari package sample
import com.kuliah.sample.BangunDatar;
import com.kuliah.sample.Lingkaran;
import com.kuliah.sample.Persegi;
import com.kuliah.sample.PersegiPanjang;
import com.kuliah.sample.Segitiga;

public class Main
{
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bgn = new BangunDatar();
        System.out.println(bgn.luas());
        System.out.println(bgn.keliling());

        // membuat objek persegi
        Persegi prs = new Persegi();
        prs.sisi = 10;

        // membuat objek persegi panjang
        PersegiPanjang psp = new PersegiPanjang();
        psp.panjang = 10;
        psp.lebar = 5;

        // membuat objek lingkaran
        Lingkaran lkg = new Lingkaran();
        lkg.jari = 10;

        // membuat objek segitiga
        Segitiga sgt = new Segitiga();
        sgt.alas = 10;
        sgt.tinggi = 5;

        // memanggil method luas
        System.out.println("Luas Persegi: " + prs.luasPersegi());
        System.out.println("Luas Persegi Panjang: " + psp.luasPersegiPanjang());
        System.out.println("Luas Lingkaran: " + lkg.luasLingkaran());
        System.out.println("Luas Segitiga: " + sgt.luasSegitiga());

        // memanggil method keliling
        System.out.println("Keliling Persegi: " + prs.kelilingPersegi());
        System.out.println("Keliling Persegi Panjang: " + psp.kelilingPersegiPanjang());
        System.out.println("Keliling Lingkaran: " + lkg.kelilingLingkaran());
        System.out.println("Keliling Segitiga: " + sgt.kelilingSegitiga());
    }
}
