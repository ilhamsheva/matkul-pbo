package com.kuliah;

// import yang akan dieksekusi
import com.kuliah.child.Ayam;
import com.kuliah.child.Burung;
import com.kuliah.child.Gurami;
import com.kuliah.child.Kambing;
import com.kuliah.child.Lele;
import com.kuliah.child.Sapi;
public class Main 
{
    public static void main( String[] args )
    {
        // object untuk hewan sapi
        Sapi sapi = new Sapi();
        sapi.display();
        System.out.println("\n");

        //object untuk hewan kambing
        Kambing kambing = new Kambing();
        kambing.display();
        System.out.println("\n");

        // object untuk hewan ayam
        Ayam ayam = new Ayam();
        ayam.display();
        System.out.println("\n");

        // object untuk hewan burung
        Burung burung = new Burung();
        burung.display();
        System.out.println("\n");

        // object untuk hewan lele
        Lele lele = new Lele();
        lele.display();
        System.out.println("\n");

        // object untuk hewan gurami
        Gurami gurami = new Gurami();
        gurami.display();
    }
}
