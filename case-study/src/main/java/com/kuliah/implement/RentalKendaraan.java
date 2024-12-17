package com.kuliah.implement;

public class RentalKendaraan implements Pembayaran {

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran berhasil dengan jumlah: Rp " + jumlah);
    }
}

