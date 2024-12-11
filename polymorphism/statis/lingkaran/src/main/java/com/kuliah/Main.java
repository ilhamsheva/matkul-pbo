package com.kuliah;

import com.kuliah.sample.Lingkaran;
public class Main 
{
    public static void main( String[] args )
    {
        System.out.println( "Luas Lingkaran" );
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Luas Lingkaran Menggunakan Radius = " + lingkaran.luas(10));
        System.out.println("Luas Lingkaran Menggunakan Diameter = " + lingkaran.luas(15.7));
    }
}
