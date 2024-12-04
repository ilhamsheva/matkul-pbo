package com.kuliah.sample;

public class Present {
    // Constructor
    public Present() {
        // Inisialisasi jika diperlukan
    }

    // Metode untuk memeriksa status kehadiran
    public void checkStatus(int kode) {
        switch (kode) {
            case 1:
                System.out.println("Status: Hadir");
                break;
            case 2:
                System.out.println("Status: Sakit");
                break;
            case 3:
                System.out.println("Status: Izin");
                break;
            case 4:
                System.out.println("Status: Alpha (Tidak Hadir)");
                break;
            default:
                System.out.println("Kode tidak valid. Masukkan antara 1 hingga 4.");
        }
    }
}