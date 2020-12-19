package com.LoredoPrasetyawan.Pertemuan_4.Praktikum.Abstrak;

public class Kambing extends Binatang{
    private String nama;

    public Kambing(String nama) {
        super("Kambing");
                this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("ngembik");
    }


    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
