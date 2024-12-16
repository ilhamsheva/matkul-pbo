package com.kuliah.sample;

public class PrintOperasi {
    public void cetakSemua(OperasiBilangan[] OB, double a, double b) {
        // perulangan for each
        for (OperasiBilangan operasi : OB) {
            // Set nilai a dan b
            operasi.set_A(a);
            operasi.set_B(b);
            // Hitung hasil
            operasi.set_C();
            // Tampilkan hasil operasi
            operasi.tampil();
        }
    }
}
