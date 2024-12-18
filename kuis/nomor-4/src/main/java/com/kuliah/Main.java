package com.kuliah;

import com.kuliah.child.Ayam;
import com.kuliah.child.Merpati;
import com.kuliah.parent.Mamalia;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Mamalia
        Mamalia mamalia = new Mamalia("Kucing");
        mamalia.setBisaJalan(true);
        mamalia.setJumlahKaki(4);
        mamalia.setJenisMamalia("Karnivora");

        System.out.println("Mamalia: " + mamalia.getNama());
        System.out.println("Bisa Jalan: " + mamalia.getBisaJalan());
        System.out.println("Jumlah Kaki: " + mamalia.getJumlahKaki());
        System.out.println("Jenis: " + mamalia.getJenisMamalia());

        // Membuat objek Ayam
        Ayam ayam = new Ayam("Ayam Jago", 2.5);
        ayam.setJenisAyam("Petarung");
        ayam.setBisaDiadu(true);

        System.out.println("\nAyam: " + ayam.getNama());
        System.out.println("Jenis Ayam: " + ayam.getJenisAyam());
        System.out.println("Bisa Diadu: " + ayam.getBisaDiadu());

        // Membuat objek Merpati
        Merpati merpati = new Merpati("Merpati Putih", 1.2);
        merpati.setBisaTerbang(true);

        System.out.println("\nMerpati: " + merpati.getNama());
        System.out.println("Bisa Terbang: " + merpati.getBisaTerbang());
    }
}
