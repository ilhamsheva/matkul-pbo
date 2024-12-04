package com.kuliah.sample;

public class Mobil
{
    String aktivitas, warna;
    int kecepatan;

    public Mobil () {
        this.aktivitas = aktivitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan() {
        if (kecepatan == 0) {
            this.aktivitas = "Parkir";
        }
    }

    void cetakAtribut() {
        System.out.println("Aktivitas : " + this.aktivitas);
        System.out.println("Warna : " + this.warna);
        System.out.println("Kecepatan : " + this.kecepatan);
    }

    public static void main(String[] args) {
        Mobil mobilku = new Mobil();
        mobilku.kecepatan = 0;
        mobilku.warna = "Merah";

        mobilku.cekKecepatan();
        mobilku.cetakAtribut();
    }
}
