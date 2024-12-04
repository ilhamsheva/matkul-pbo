package com.kuliah;

// mengimport dari package kelas sample
import com.kuliah.sample.Countdown;
import com.kuliah.sample.Present;
import com.kuliah.sample.PrimeNumber;

// untuk input user
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumber primeNumber = new PrimeNumber();
        Countdown countdown = new Countdown();
        Present present = new Present();

        int pilihan;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cek Bilangan Prima");
            System.out.println("2. Hitungan Mundur");
            System.out.println("3. Status Kehadiran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Cek Bilangan Prima
                    System.out.print("Masukkjavaan angka: ");
                    int angka = scanner.nextInt();
                    if (primeNumber.isPrime(angka)) {
                        System.out.println(angka + " adalah bilangan prima.");
                    } else {
                        System.out.println(angka + " bukan bilangan prima.");
                    }
                    break;
                case 2:
                    // Hitungan Mundur
                    System.out.print("Masukkan angka untuk hitungan mundur: ");
                    int hitung = scanner.nextInt();
                    countdown.startCountdown(hitung);
                    break;
                case 3:
                    // Status Kehadiran
                    System.out.print("Masukkan kode kehadiran (1: Hadir, 2: Sakit, 3: Izin, 4: Alpha): ");
                    int kode = scanner.nextInt();
                    present.checkStatus(kode);
                    break;
                case 4:
                    // Keluar
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
