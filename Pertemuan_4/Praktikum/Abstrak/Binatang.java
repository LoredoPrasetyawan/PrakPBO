package com.LoredoPrasetyawan.Pertemuan_4.Praktikum.Abstrak;

public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis) {
        this.jenis = jenis;
    }

    //method abstract
    protected abstract void suara();

    public String toString() {
        return "Seekor " + jenis;
    }
}