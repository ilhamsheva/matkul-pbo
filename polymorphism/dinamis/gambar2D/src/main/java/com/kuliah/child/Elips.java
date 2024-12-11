package com.kuliah.child;

// import parent
import com.kuliah.parent.Bentuk;

public class Elips extends Bentuk {
    @Override
    public void gambar(){
        System.out.println("subclass -> Menggambar Elips");
    }

    @Override
    public void hapus(){
        System.out.println("subclass -> Menghapus Elips");
    }
}
