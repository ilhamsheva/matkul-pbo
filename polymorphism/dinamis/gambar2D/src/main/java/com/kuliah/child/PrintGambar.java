package com.kuliah.child;

// import parent
import com.kuliah.parent.Bentuk;

public class PrintGambar extends Bentuk {
    public void tampil(Bentuk[] obj){
        // Polimorfisme\
        // Menggunakan for each karena ada array
        for (Bentuk obj1 : obj) {
            obj1.gambar();
            obj1.hapus();
        }
    }
}
