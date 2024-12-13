package com.kuliah.sample;

public class Perkalian extends OperasiBilangan {
    @Override
    protected void tampil() {
        c = a * b;
        System.out.println("Perkalian: " + a + " * " + b + " = " + c);
    }
}
