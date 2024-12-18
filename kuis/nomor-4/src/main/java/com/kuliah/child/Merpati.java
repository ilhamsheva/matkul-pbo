package com.kuliah.child;

import com.kuliah.parent.Aves;

public class Merpati extends Aves {
    public Merpati() {
    }

    public Merpati(String nama, double ukuran) {
        super(nama, ukuran);
    }

    @Override
    public void setBisaTerbang(boolean bisaTerbang) {
        super.setBisaTerbang(bisaTerbang);
    }

    @Override
    public boolean getBisaTerbang() {
        return super.getBisaTerbang();
    }
}
