package com.kuliah.child;

// import parent
import com.kuliah.parent.Bentuk;

public class Segitiga extends Bentuk {
    @Override
    public void gambar(){
        System.out.println("subclass -> Menggambar Segitiga");
    }

    @Override
    public void hapus(){
        System.out.println("subclass -> Menghapus Segitiga");
    }
}
