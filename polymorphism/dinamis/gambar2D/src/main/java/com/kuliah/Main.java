package com.kuliah;

import com.kuliah.child.Elips;
import com.kuliah.child.Lingkaran;
import com.kuliah.child.PrintGambar;
import com.kuliah.child.Segitiga;
import com.kuliah.parent.Bentuk;

public class Main 
{
    public static void main( String[] args )
    {
        Bentuk[] obj = {new Segitiga(), new Elips(), new Lingkaran()};
        PrintGambar pg = new PrintGambar();
        pg.gambar();
        pg.hapus();

        pg.tampil(obj);
    }
}
