package com.kuliah;

import com.kuliah.sample.OperasiBilangan;
import com.kuliah.sample.Pembagian;
import com.kuliah.sample.Pengurangan;
import com.kuliah.sample.Penjumlahan;
import com.kuliah.sample.Perkalian;
import com.kuliah.sample.PrintOperasi;

public class Main 
{
    public static void main( String[] args )
    {
        // Nilai A dan B
        double A = 10.5;
        double B = 0.5;

        // Array operasi
        OperasiBilangan[] operasiArray = {
            new Penjumlahan(),
            new Pengurangan(),
            new Perkalian(),
            new Pembagian()
        };

        // Cetak semua operasi
        PrintOperasi cetak = new PrintOperasi();
        cetak.cetakSemua(operasiArray, A, B);
    }
}
