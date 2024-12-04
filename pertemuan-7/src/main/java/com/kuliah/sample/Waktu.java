package com.kuliah.sample;

public class Waktu {
    private int menitWaktu;

    // Constructor
    public Waktu() {
        this.menitWaktu = 0; // waktu dimulai dari 00:00
    }

    // Getter untuk jam
    public int getJam() {
        return menitWaktu / 60;
    }

    // Getter untuk menit
    public int getMenit() {
        return menitWaktu % 60;
    }

    // Setter untuk jam
    public void setJam(int jam) {
        this.menitWaktu = (jam * 60) + getMenit();
    }

    // Setter untuk menit
    public void setMenit(int menit) {
        this.menitWaktu = (getJam() * 60) + menit;
    }

    // Mendapatkan total menit
    public int getTotalMenit() {
        return menitWaktu;
    }

    // Menambah jam
    public void tambahJam(int j) {
        this.menitWaktu += j * 60;
    }

    // Menambah menit
    public void tambahMenit(int m) {
        this.menitWaktu += m;
    }

    // Menambah waktu dalam jam dan menit
    public void tambahWaktu(int j, int m) {
        this.menitWaktu += (j * 60) + m;
    }

    // Menampilkan waktu dalam format HH:MM
    public void tampilWaktu() {
        int jam = getJam();
        int menit = getMenit();
        System.out.printf("%02d:%02d\n", jam, menit);
    }
}
