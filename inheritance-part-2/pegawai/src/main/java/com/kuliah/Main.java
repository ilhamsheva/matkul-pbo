package com.kuliah;

// import child yang akan dieksekusi
import com.kuliah.child.Kasir;
import com.kuliah.child.Koki;
import com.kuliah.child.Manager;
import com.kuliah.child.Pelayan;
import com.kuliah.child.Satpam;
import com.kuliah.parent.Pegawai;

public class Main
{
    public static void main( String[] args )
    {
        // Membuat objek
        Pegawai pegawai = new Pegawai();
        Manager manager = new Manager();
        Kasir kasir = new Kasir();
        Koki koki = new Koki();
        Pelayan pelayan = new Pelayan();
        Satpam satpam = new Satpam();

        // Memasukkan nilai variabel manager
        manager.nama = "Sifa";
        manager.id_pegawai = 1;
        manager.gaji = "10.000.000";

        // Memasukkan nilai variabel kasir
        kasir.nama = "Aldi";
        kasir.id_pegawai = 2;
        kasir.gaji = "1.200.000";

        // Memasukkan nilai variabel koki
        koki.nama = "Budi";
        koki.id_pegawai = 3;
        koki.gaji = "2.000.000";

        // Pelayan
        pelayan.nama = "Dean";
        pelayan.id_pegawai = 4;
        pelayan.gaji = "1.000.000";

        // Satpam
        satpam.nama = "Aldi";
        satpam.id_pegawai = 5;
        satpam.gaji = "1.000.000";

        pegawai.display();
        
        manager.display();
        manager.tugas();

        kasir.display();
        kasir.tugas();

        koki.display();
        koki.tugas();

        pelayan.display();
        pelayan.tugas();
        
        satpam.display();
        satpam.tugas();
    }
}
