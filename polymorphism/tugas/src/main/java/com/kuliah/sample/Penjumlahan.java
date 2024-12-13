package com.kuliah.sample;

public class Penjumlahan extends OperasiBilangan {
    @Override
    protected void tampil() {
        c = a + b;
        System.out.println("Penjumlahan: " + a + " + " + b + " = " + c);
    }
}
