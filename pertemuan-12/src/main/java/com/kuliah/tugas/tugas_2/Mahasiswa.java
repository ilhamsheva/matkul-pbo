package com.kuliah.tugas.tugas_2;

class Mahasiswa {
    final private String nrp;
    final private String nama;
    final private float nilai;

    // Constructor
    public Mahasiswa(String nrp, String nama, float nilai) {
        this.nrp = nrp;
        this.nama = nama;
        this.nilai = nilai;
    }

    // Getter
    public String getNrp() {
        return nrp;
    }

    public String getNama() {
        return nama;
    }

    public float getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nrp='" + nrp + "', nama='" + nama + "', nilai=" + nilai + "}";
    }
}