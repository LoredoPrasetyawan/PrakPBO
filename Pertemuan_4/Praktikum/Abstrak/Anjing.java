package com.LoredoPrasetyawan.Pertemuan_4.Praktikum.Abstrak;

public class Anjing extends Binatang {
    private String nama;

    public Anjing(String nama){
        super("Anjim");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("menggonggong");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
