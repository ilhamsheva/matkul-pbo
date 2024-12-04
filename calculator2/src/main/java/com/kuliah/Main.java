package com.kuliah;

// Import dari kelas Kalkulator
import com.kuliah.Kalkulator;

// Utility dari Java untuk input user
import java.util.Scanner;

// Kelas Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Membuat scanner untuk input dari pengguna
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek kalkulator

        // Meminta input dari pengguna untuk angka-angka yang diperlukan
        System.out.print("Masukkan angka pertama    : ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua      : ");
        double angka2 = input.nextDouble();

        System.out.print("Masukkan angka ketiga     : ");
        double angka3 = input.nextDouble();

        System.out.print("Masukkan angka keempat    : ");
        double angka4 = input.nextDouble();

        // Menampilkan menu operasi untuk angka pertama dan kedua
        double hasil1 = pilihOperasi(input, angka1, angka2); // Mendapatkan hasil dari operasi pertama
        double hasil2 = pilihOperasi(input, angka3, angka4); // Mendapatkan hasil dari operasi kedua

        // Menggabungkan kedua hasil dengan prioritas operasi
        double hasilAkhir = gabungkanHasil(input, kalkulator, hasil1, hasil2); // Mendapatkan hasil akhir

        // Menampilkan hasil akhir kepada pengguna
        System.out.println("Hasil akhir: " + hasilAkhir);
        input.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    }

    // Metode untuk memilih operasi dan menghitung hasilnya
    private static double pilihOperasi(Scanner input, double angka1, double angka2) {
        System.out.println("Pilih operasi untuk angka " + angka1 + " dan " + angka2 + ": ");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan: ");
        int operasi = input.nextInt(); // Mengambil pilihan operasi dari pengguna
        
        Kalkulator kalkulator = new Kalkulator(); // Membuat objek kalkulator
        double hasil = 0; // Variabel untuk menyimpan hasil

        // Menggunakan switch untuk menentukan operasi yang dipilih
        switch (operasi) {
            case 1:
                hasil = kalkulator.tambah(angka1, angka2); // Menjalankan penjumlahan
                break;
            case 2:
                hasil = kalkulator.kurang(angka1, angka2); // Menjalankan pengurangan
                break;
            case 3:
                hasil = kalkulator.kali(angka1, angka2); // Menjalankan perkalian
                break;
            case 4:
                hasil = kalkulator.bagi(angka1, angka2); // Menjalankan pembagian
                break;
            default:
                System.out.println("Pilihan tidak valid."); // Menangani pilihan yang tidak valid
                return 0; // Mengembalikan hasil 0 jika tidak valid
        }

        // Menampilkan hasil operasi yang dilakukan
        System.out.println("Hasil operasi: " + hasil);
        return hasil; // Mengembalikan hasil
    }

    // Metode untuk menggabungkan hasil dari dua operasi sebelumnya
    private static double gabungkanHasil(Scanner input, Kalkulator kalkulator, double hasil1, double hasil2) {
        System.out.println("Pilih operasi final antara hasil pertama dan hasil kedua: ");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Masukkan pilihan: ");
        int operasiFinal = input.nextInt(); // Mengambil pilihan operasi final dari pengguna
        double hasilAkhir = 0; // Variabel untuk menyimpan hasil akhir

        // Menggunakan switch untuk menentukan operasi final yang dipilih
        switch (operasiFinal) {
            case 1:
                hasilAkhir = kalkulator.tambah(hasil1, hasil2); // Menjalankan penjumlahan
                break;
            case 2:
                hasilAkhir = kalkulator.kurang(hasil1, hasil2); // Menjalankan pengurangan
                break;
            case 3:
                hasilAkhir = kalkulator.kali(hasil1, hasil2); // Menjalankan perkalian
                break;
            case 4:
                hasilAkhir = kalkulator.bagi(hasil1, hasil2); // Menjalankan pembagian
                break;
            default:
                System.out.println("Pilihan tidak valid."); // Menangani pilihan yang tidak valid
                return 0; // Mengembalikan hasil 0 jika tidak valid
        }

        return hasilAkhir; // Mengembalikan hasil akhir
    }
}
