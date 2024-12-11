package com.kuliah;

import com.kuliah.sample.Polymorph;

public class Main
{
    public static void main( String[] args )
    {
        Polymorph p = new Polymorph();
        System.out.println(p.tambah("Hello", "World"));
        System.out.println(p.tambah(1, 2));
    }
}
