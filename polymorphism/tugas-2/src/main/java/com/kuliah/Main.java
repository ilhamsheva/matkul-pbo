package com.kuliah;

import com.kuliah.sample.OperasiBilangan;
import com.kuliah.sample.Pembagian;
import com.kuliah.sample.Pengurangan;
import com.kuliah.sample.Penjumlahan;
import com.kuliah.sample.Perkalian;
import com.kuliah.sample.PrintOperasi;

public class Main {
    public static void main(String[] args) {
        // Membuat objek untuk setiap operasi
        OperasiBilangan penjumlahan = new Penjumlahan();
        OperasiBilangan pengurangan = new Pengurangan();
        OperasiBilangan perkalian = new Perkalian();
        OperasiBilangan pembagian = new Pembagian();

        // Menyimpan operasi dalam array
        OperasiBilangan[] operasiArray = {penjumlahan, pengurangan, perkalian, pembagian};

        // Membuat objek PrintOperasi untuk mencetak hasil
        PrintOperasi printOperasi = new PrintOperasi();
        
        // Memanggil metode cetakSemua
        printOperasi.cetakSemua(operasiArray, 6.5, 0.5);
    }
}
