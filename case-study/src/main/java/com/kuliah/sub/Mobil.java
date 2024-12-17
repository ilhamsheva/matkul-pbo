package com.kuliah.sub;

import com.kuliah.parent.Kendaraan;

public class Mobil extends Kendaraan {

    public Mobil(String nama, int kapasitas, double hargaSewaPerHari) {
        super(nama, "Mobil", kapasitas, hargaSewaPerHari);
    }

    @Override
    public double hitungHargaSewa(int jumlahHari) {
        return hargaSewaPerHari * jumlahHari;
    }
}
