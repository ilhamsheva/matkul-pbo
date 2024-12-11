package com.kuliah.implementation;

import com.kuliah.parent.Bidang2D;

public class PersegiPanjang implements Bidang2D {
    public double panjang, lebar;

    @Override
    public double getKeliling() {
        return (panjang + lebar) * 2;
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }
}
