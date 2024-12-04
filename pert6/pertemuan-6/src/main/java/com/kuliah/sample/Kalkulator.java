package com.kuliah.sample;

import java.lang.Math;

class Kalkulator {
    // Attributes
    public double operand1, operand2;

    // Method setter for operand1
    public void isiOperand1(double operand1) {
        this.operand1 = operand1;
    }

    // Method setter for operand2
    public void isiOperand2(double operand2) {
        this.operand2 = operand2;
    }

    // Method for addition
    public double penjumlahan() {
        return operand1 + operand2;
    }

    // Method for subtraction
    public double pengurangan() {
        return operand1 - operand2;
    }

    // Method for multiplication
    public double perkalian() {
        return operand1 * operand2;
    }

    // Method for division
    public double pembagian() {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Pembagian dengan nol tidak diperbolehkan");
            return Double.NaN; // Use Double.NaN instead of double.NaN
        }
    }

    // Method for power
    public double pangkat() {
        return Math.pow(operand1, operand2);
    }

    // Main function
    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();

        // Setting values
        calc.isiOperand1(10.0);
        calc.isiOperand2(4.0);

        // Displaying results
        System.out.println("Hasil penjumlahan: " + calc.penjumlahan());
        System.out.println("Hasil pengurangan: " + calc.pengurangan());
        System.out.println("Hasil perkalian: " + calc.perkalian());
        System.out.println("Hasil pembagian: " + calc.pembagian());
        System.out.println("Hasil pangkat: " + calc.pangkat());
    }
}
