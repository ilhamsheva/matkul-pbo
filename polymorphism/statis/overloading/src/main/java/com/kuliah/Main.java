package com.kuliah;

import com.kuliah.sample.Overloading;
public class Main
{
    public static void main( String[] args )
    {
        Overloading obj = new Overloading();
        obj.tampil();
        obj.tampil(10);
        obj.tampil(10,20);
        obj.tampil("Hello");
    }
}
