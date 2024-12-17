package com.kuliah.sub;

import com.kuliah.parent.Kendaraan;

public class Truk extends Kendaraan {

    public Truk(String nama, int kapasitas, double hargaSewaPerHari) {
        super(nama, "Truk", kapasitas, hargaSewaPerHari);
    }

    @Override
    public double hitungHargaSewa(int jumlahHari) {
        return hargaSewaPerHari * jumlahHari * 1.5; // Truk 50% lebih mahal dari harga standar
    }
}
