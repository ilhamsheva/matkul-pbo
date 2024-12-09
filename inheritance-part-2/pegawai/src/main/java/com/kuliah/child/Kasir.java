package com.kuliah.child;

// import class dari parent
import com.kuliah.parent.Pegawai;

public class Kasir extends Pegawai {
    // override dari fungsi display di parent
    @Override
    public void display(){
        System.out.println("Nama: " + nama);
        System.out.println("Id Pegawai: " + id_pegawai);
        System.out.println("Gaji: " + gaji);
    }

    public void tugas(){
        System.out.println("Tugasnya adalah melakukan transaksi dengan pembeli");
        System.out.println("--------------------------------------------------");
    }
}
