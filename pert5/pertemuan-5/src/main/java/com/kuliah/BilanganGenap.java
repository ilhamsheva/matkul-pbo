package com.kuliah;

import java.util.Scanner;

public class BilanganGenap {
    public static void main(String[] args){
        int max = 100;

        for (int i = 1; i <= max; i++){
            if (i % 2 == 0){
                System.out.println("Angka : " + i);
            }
        }
    }
}