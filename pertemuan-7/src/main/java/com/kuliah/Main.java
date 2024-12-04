package com.kuliah;

import com.kuliah.sample.*;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobil1 = new Mobil("Toyota", 2020, 300000000);
        Mobil mobil2 = new Mobil("Honda", 2018, 250000000);

        System.out.println("Informasi Mobil 1:");
        mobil1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Mobil 2:");
        mobil2.tampilkanInfo();
        System.out.println();

        // Membuat objek dari kelas Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("Andi", 21, "Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Budi", 22, "Sistem Informasi");

        System.out.println("Informasi Mahasiswa 1:");
        mahasiswa1.tampilkanInfo();
        System.out.println();

        System.out.println("Informasi Mahasiswa 2:");
        mahasiswa2.tampilkanInfo();
        System.out.println();

        // Membuat objek dari kelas Mahasiswa
        Siswa siswa1 = new Siswa("Andrue", 90);
        siswa1.tampilkanInfo();
        System.out.println();

        // Membuat objek dari kelas Nilai
        Nilai n = new Nilai();
        n.setQuiz(90);
        n.setUts(70);
        n.setUAS(85);
        System.out.println("Nilai Akhir: " + n.getNilaiAkhir());
        System.out.println();

        // Membuat objek Waktu
        Waktu waktu = new Waktu();

        // Menampilkan waktu awal (seharusnya 00:00)
        System.out.print("Waktu awal: ");
        waktu.tampilWaktu();

        // Mengatur jam menjadi 10 dan menit menjadi 30
        waktu.setJam(10);
        waktu.setMenit(30);
        System.out.print("Setelah setJam(10) dan setMenit(30): ");
        waktu.tampilWaktu();

        // Menambah 2 jam
        waktu.tambahJam(2);
        System.out.print("Setelah tambahJam(2): ");
        waktu.tampilWaktu();

        // Menambah 45 menit
        waktu.tambahMenit(45);
        System.out.print("Setelah tambahMenit(45): ");
        waktu.tampilWaktu();

        // Menambah 1 jam dan 20 menit
        waktu.tambahWaktu(1, 20);
        System.out.print("Setelah tambahWaktu(1, 20): ");
        waktu.tampilWaktu();

        // Mendapatkan jam, menit, dan total menit
        System.out.println("Jam saat ini: " + waktu.getJam());
        System.out.println("Menit saat ini: " + waktu.getMenit());
        System.out.println("Total menit sejak 00:00: " + waktu.getTotalMenit());

    }
}