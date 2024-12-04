package com.kuliah;

import java.util.Scanner;

public class Number
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int angka = input.nextInt();

        if (angka > 0){
            System.out.println("Angka positif");
        }
        else if (angka < 0){
            System.out.println("Angka negatif");
        }
        else {
            System.out.println("Angka nol");
        }

        input.close();
    }
}
