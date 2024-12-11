package com.kuliah.implementation;

import com.kuliah.parent.Bidang2D;

public class BujurSangkar implements Bidang2D {
    public double sisi;

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return sisi * 4;
    }
}
