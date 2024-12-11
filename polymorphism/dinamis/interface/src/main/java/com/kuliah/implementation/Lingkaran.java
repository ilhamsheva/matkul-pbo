package com.kuliah.implementation;

import com.kuliah.parent.Bidang2D;

public class Lingkaran implements Bidang2D {
    public double radius;

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }
}
