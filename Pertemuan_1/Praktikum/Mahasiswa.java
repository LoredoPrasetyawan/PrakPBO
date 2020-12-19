package com.LoredoPrasetyawan.Pertemuan_1.Praktikum;

//class yg dipanggil
public class Mahasiswa {
    String nama;
    int nim;

    //contractor = nama method yg sama dgn classnya, pintasan alt+insert
    //cpnstuctor kosongan
    public Mahasiswa(){

    }
    //contructor udh ada variablenya, ada parameternya
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    //getter & setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}