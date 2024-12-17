package com.kuliah;

import com.kuliah.implement.RentalKendaraan;
import com.kuliah.parent.Kendaraan;
import com.kuliah.sub.Mobil;
import com.kuliah.sub.SepedaMotor;
import com.kuliah.sub.Truk;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Toyota Camry", 5, 500000);
        Kendaraan motor = new SepedaMotor("Yamaha NMAX", 2, 150000);
        Kendaraan truk = new Truk("Hino 500", 10, 1000000);

        int jumlahHari = 5;
        
        // Menghitung harga sewa untuk setiap kendaraan
        double hargaMobil = mobil.hitungHargaSewa(jumlahHari);
        double hargaMotor = motor.hitungHargaSewa(jumlahHari);
        double hargaTruk = truk.hitungHargaSewa(jumlahHari);

        // Menampilkan hasil harga sewa
        System.out.println("Harga sewa mobil: Rp " + hargaMobil);
        System.out.println("Harga sewa motor: Rp " + hargaMotor);
        System.out.println("Harga sewa truk: Rp " + hargaTruk);

        // Proses pembayaran
        RentalKendaraan rental = new RentalKendaraan();
        rental.prosesPembayaran(hargaMobil);
        rental.prosesPembayaran(hargaMotor);
        rental.prosesPembayaran(hargaTruk);
    }
}
