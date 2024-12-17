package com.kuliah.sub;

import com.kuliah.parent.Kendaraan;

public class SepedaMotor extends Kendaraan {

    public SepedaMotor(String nama, int kapasitas, double hargaSewaPerHari) {
        super(nama, "Sepeda Motor", kapasitas, hargaSewaPerHari);
    }

    @Override
    public double hitungHargaSewa(int jumlahHari) {
        return hargaSewaPerHari * jumlahHari * 0.8; // Sepeda motor 20% lebih murah dari harga standar
    }
}

