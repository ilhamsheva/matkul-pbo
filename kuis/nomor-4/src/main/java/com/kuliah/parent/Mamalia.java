package com.kuliah.parent;

public class Mamalia extends Animal {
    @SuppressWarnings("unused")
    private String jalan, jenisMamalia;
    private boolean bisaJalan;
    private int jumlahKaki;

    public Mamalia() {
    }

    public Mamalia(String nama) {
        setNama(nama);
    }

    public void setBisaJalan(boolean bisaJalan) {
        this.bisaJalan = bisaJalan;
    }

    public boolean getBisaJalan() {
        return bisaJalan;
    }

    public void setJumlahKaki(int jumlahKaki) {
        this.jumlahKaki = jumlahKaki;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public void setJenisMamalia(String jenisMamalia) {
        this.jenisMamalia = jenisMamalia;
    }

    public String getJenisMamalia() {
        return jenisMamalia;
    }
}
