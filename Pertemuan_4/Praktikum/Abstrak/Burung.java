package com.LoredoPrasetyawan.Pertemuan_4.Praktikum.Abstrak;

public class Burung extends Binatang{
    public String nama;

    public Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("berkicau..");
    }

    @Override
    public String toString() {
        return super.toString() +" " + nama;
    }
}
