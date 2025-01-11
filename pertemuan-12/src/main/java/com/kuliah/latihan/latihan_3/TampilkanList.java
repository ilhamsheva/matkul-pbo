package com.kuliah.latihan.latihan_3;

import java.util.List;

public class TampilkanList {

    // Utility method untuk menampilkan data list
    public static void tampilkanList(List<Mahasiswa> list) {
        for (Mahasiswa mhs : list) {
            System.out.println(mhs);
        }
    }
}