package com.kuliah.child;

// import parent
import com.kuliah.parent.Pegawai;

public class Manager extends Pegawai{
    @Override
    public void display(){
        System.out.println("Nama: " + nama);
        System.out.println("Id Pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    public void tugas(){
        System.out.println("Tugasnya adalah melakukan manajemen untuk franchise");
        System.out.println("---------------------------------------------------");
    }
}
