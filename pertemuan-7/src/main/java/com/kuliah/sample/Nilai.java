package com.kuliah.sample;

public class Nilai {
    private double quiz, uts, uas;

    // Constructor
    public Nilai() {
    }

    // Setter for quiz
    public void setQuiz(double x) {
        if (x >= 0 && x <= 100) {
            this.quiz = x;
        } else {
            System.out.println("Nilai quiz harus antara 0 dan 100.");
        }
    }

    // Setter for uts
    public void setUts(double x) {
        if (x >= 0 && x <= 100) {
            this.uts = x;
        } else {
            System.out.println("Nilai UTS harus antara 0 dan 100.");
        }
    }

    // Setter for uas
    public void setUAS(double x) {
        if (x >= 0 && x <= 100) {
            this.uas = x;
        } else {
            System.out.println("Nilai UAS harus antara 0 dan 100.");
        }
    }

    // Getter for quiz
    public double getQuiz() {
        return this.quiz;
    }

    // Getter for uts
    public double getUts() {
        return this.uts;
    }

    // Getter for uas
    public double getUAS() {
        return this.uas;
    }

    // Getter for nilai akhir
    public double getNilaiAkhir() {
        return (0.2 * this.getQuiz() + 0.3 * this.getUts() + 0.5 * this.getUAS());
    }
}