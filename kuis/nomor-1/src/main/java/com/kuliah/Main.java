package com.kuliah;


public class Main
{
    public static void main( String[] args )
    {
        Dosen dosen = new Dosen("123", "John Doe");
        Rektor rektor = new Rektor("456", "Jane Doe", 2000);
        Dekan dekan = new Dekan("789", "Bob Smith", "Fakultas Teknik");

        dosen.view();
        rektor.viewRektor();
        dekan.viewDekan();
    }
}
