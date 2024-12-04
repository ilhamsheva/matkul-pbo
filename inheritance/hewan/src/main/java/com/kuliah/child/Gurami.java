package com.kuliah.child;

import com.kuliah.parent.Ikan;

public class Gurami extends Ikan{
    final private String ciri, berat;

    public Gurami() {
        super();
        this.ciri = "berwarna hitam";
        this.berat = "2 kg";
    }

    @Override
    public void display() {
        System.out.println("============Data Gurami============");
        super.display();
        System.out.println("gurami dengan ciri " + this.ciri);
        System.out.println("gurami dengan berat " + this.berat);
    }
}
