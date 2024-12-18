package com.kuliah.parent;

public class Aves extends Animal {
    private String jenisAves;
    private boolean bisaTerbang;

    public Aves() {
    }

    public Aves(String nama, double ukuran) {
        setNama(nama);
        setUkuran((int) ukuran);
    }

    public void setBisaTerbang(boolean bisaTerbang) {
        this.bisaTerbang = bisaTerbang;
    }

    public boolean getBisaTerbang() {
        return bisaTerbang;
    }

    public void setJenisAves(String jenisAves) {
        this.jenisAves = jenisAves;
    }

    public String getJenisAves() {
        return jenisAves;
    }
}
