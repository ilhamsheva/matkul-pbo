package com.kuliah;

import com.kuliah.child.Laptop;
import com.kuliah.child.Netbook;
import com.kuliah.child.PC;
import com.kuliah.parent.Komputer;

public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Laptop, Netbook, dan PC
        Komputer laptop = new Laptop();
        Komputer netbook = new Netbook();
        Komputer pc = new PC();

        // Menyimpan objek dalam array Komputer
        Komputer[] komputerArray = {laptop, netbook, pc};

        // Membuat objek Print untuk mencetak hasil
        Print print = new Print();

        // Memanggil metode cetakSemua untuk mencetak informasi semua objek Komputer
        print.cetakSemua(komputerArray);
    }
}
