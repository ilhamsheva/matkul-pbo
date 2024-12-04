package com.kuliah;

import com.kuliah.sample.Balok;
import com.kuliah.sample.Bola;
import com.kuliah.sample.Kubus;
import com.kuliah.sample.Lingkaran;
import com.kuliah.sample.Segitiga;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("====================================");
            System.out.println("FUNGSI BANGUN RUANG DAN BANGUN DATAR");
            System.out.println("====================================");
            System.out.println("1. Balok");
            System.out.println("2. Bola");
            System.out.println("3. Kubus");
            System.out.println("4. Lingkaran");
            System.out.println("5. Segitiga");
            System.out.println("6. Keluar");
            System.out.print("Masukkan pilihan (1-6): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1: // Balok
                    System.out.print("Masukkan panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar: ");
                    int lebar = scanner.nextInt();
                    System.out.print("Masukkan tinggi: ");
                    int tinggi = scanner.nextInt();

                    int volumeBalok = Balok.getVolume(panjang, lebar, tinggi);
                    int luasPermukaanBalok = Balok.getLuasPermukaan(panjang, lebar, tinggi);

                    System.out.printf("Volume Balok: %d\n", volumeBalok);
                    System.out.printf("Luas Permukaan Balok: %d\n", luasPermukaanBalok);
                    break;

                case 2: // Bola
                    System.out.print("Masukkan jari-jari: ");
                    int jariBola = scanner.nextInt();

                    double volumeBola = Bola.getVolume(jariBola);
                    double luasPermukaanBola = Bola.getLuasPermukaan(jariBola);

                    System.out.printf("Volume Bola: %.2f\n", volumeBola);
                    System.out.printf("Luas Permukaan Bola: %.2f\n", luasPermukaanBola);
                    break;

                case 3: // Kubus
                    System.out.print("Masukkan sisi: ");
                    int sisiKubus = scanner.nextInt();

                    int volumeKubus = Kubus.getVolume(sisiKubus);
                    int luasPermukaanKubus = Kubus.getLuasPermukaan(sisiKubus);

                    System.out.printf("Volume Kubus: %d\n", volumeKubus);
                    System.out.printf("Luas Permukaan Kubus: %d\n", luasPermukaanKubus);
                    break;

                case 4: // Lingkaran
                    System.out.print("Masukkan jari-jari: ");
                    int jariLingkaran = scanner.nextInt();

                    double kelilingLingkaran = Lingkaran.getKeliling(jariLingkaran);
                    double luasPermukaanLingkaran = Lingkaran.getLuasPermukaan(jariLingkaran);

                    System.out.printf("Keliling Lingkaran: %.2f\n", kelilingLingkaran);
                    System.out.printf("Luas Permukaan Lingkaran: %.2f\n", luasPermukaanLingkaran);
                    break;

                case 5: // Segitiga
                    System.out.print("Masukkan sisi a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Masukkan sisi b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Masukkan sisi c: ");
                    double c = scanner.nextDouble();

                    double kelilingSegitiga = Segitiga.getKeliling(a, b, c);
                    
                    // Menghitung luas segitiga menggunakan rumus Heron
                    double semiPerimeter = (a + b + c) / 2;
                    double luasSegitiga = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

                    System.out.printf("Luas Segitiga: %.2f\n", luasSegitiga);
                    System.out.printf("Keliling Segitiga: %.2f\n", kelilingSegitiga);
                    break;

                case 6: // Keluar
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 6);

        scanner.close();
    }
}
