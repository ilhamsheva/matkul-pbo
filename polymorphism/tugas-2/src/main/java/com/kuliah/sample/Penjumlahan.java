package com.kuliah.sample;

public class Penjumlahan extends OperasiBilangan {
    
    // Implementasi method set_A
    @Override
    protected void set_A(double a) {
        this.a = a;
    }
    
    // Implementasi method set_B
    @Override
    protected void set_B(double b) {
        this.b = b;
    }
    
    // Implementasi method set_C (hasil penjumlahan a dan b)
    @Override
    protected void set_C() {
        this.c = this.a + this.b;
    }
    
    // Implementasi method get_A
    @Override
    protected double get_A() {
        return this.a;
    }
    
    // Implementasi method get_B
    @Override
    protected double get_B() {
        return this.b;
    }
    
    // Implementasi method get_C (hasil penjumlahan)
    @Override
    protected double get_C() {
        return this.c;
    }
    
    // Implementasi method tampil untuk menampilkan hasil
    @Override
    protected void tampil() {
        System.out.println("Hasil Penjumlahan: " + get_C());
    }
}
