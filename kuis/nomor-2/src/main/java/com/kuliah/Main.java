// File: Main.java
package com.kuliah;

public class Main {
    public static void main(String[] args) {
        Gojek gojek = new Gojek();
        gojek.setId(101);
        gojek.setHarga(5000);

        Bayar bayar = new Bayar();
        bayar.setId(gojek.getId());
        bayar.setHarga(gojek.getHarga());
        bayar.setData("John Doe", 15);

        System.out.println("== Data Gojek ==");
        gojek.tampil();

        System.out.println("\n== Data Pembayaran ==");
        bayar.tampil();
    }
}