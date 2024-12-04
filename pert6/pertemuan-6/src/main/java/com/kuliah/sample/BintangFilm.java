package com.kuliah.sample;

class BintangFilm {
    // Atribute
    private String nama;
    private boolean pria;

    // Constructor
    public BintangFilm(String nama, boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method tanpa return
    private void isikan (String nama, boolean pria) {
        this.nama = nama;
        this.pria = pria;
    }

    // Method dengan return
    String getNama() {
        return this.nama;
    }

    String getGender() {
        return pria ? "Pria" : "Wanita";
    }

    public static void main(String[] args) {
        // buat dua object
        BintangFilm siA = new BintangFilm("Budi", true);
        BintangFilm siB = new BintangFilm("Hani", false);

        // Menampilkan objek
        System.out.println("Si A: " + siA.getNama() + " " + siA.getGender());
        System.out.println("Si B: " + siB.getNama() + " " + siB.getGender());
    }
}   