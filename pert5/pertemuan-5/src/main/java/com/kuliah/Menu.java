package com.kuliah;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num; // Declare num outside the do block

        do {
            System.out.print("Masukkan angka: ");
            num = input.nextInt();
        } while (num != 0);

        System.out.println("Program Selesai");
        input.close(); // Close the Scanner
    }
}
