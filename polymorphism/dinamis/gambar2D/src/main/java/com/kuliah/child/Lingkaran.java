package com.kuliah.child;

// import parent
import com.kuliah.parent.Bentuk;

public class Lingkaran extends Bentuk {
    @Override
    public void gambar(){
        System.out.println("subclass -> Menggambar Lingkaran");
    }

    @Override
    public void hapus(){
        System.out.println("subclass -> Menghapus Lingkaran");
    }
}
