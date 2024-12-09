package com.kuliah.parent;

public class Pegawai {
    // Atribut di setting ke public karena ingin digunakan untuk child
    public String nama;
    public int id_pegawai;
    public String gaji;

    // DISPLAY METHOD
    public void display(){
        System.out.println("Menampilkan nama, id pegawai, gaji, dan tugas");
        System.out.println("---------------------------------------------");
    }
}
