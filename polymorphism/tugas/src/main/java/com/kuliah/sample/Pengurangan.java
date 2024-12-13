package com.kuliah.sample;

public class Pengurangan extends OperasiBilangan{
    @Override
    protected void tampil() {
        c = a - b;
        System.out.println("Pengurangan: " + a + " - " + b + " = " + c);
    }
}
