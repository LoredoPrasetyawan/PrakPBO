package com.LoredoPrasetyawan.Pertemuan_3.Praktikum.Asosiasi;

public class Dosen {
    private String KodeDosen;
    private int nimMHS[]= new int[10];
    private int jmlMahasiswa;

    public Dosen(){
    }

    public String getKode() {
        return KodeDosen;
    }

    public void setKode(String kode) {
        KodeDosen = kode;
    }

    public int getJmlMahasiswa() {
        return jmlMahasiswa;
    }

    public void setJmlMahasiswa(int jmlMahasiswa) {
        this.jmlMahasiswa = jmlMahasiswa;
    }
    public int getnims(int indeks){
        return (nimMHS[indeks]);
    }

    public void setNimMHS(int nim){
        nimMHS[jmlMahasiswa] = nim;
        jmlMahasiswa++;
    }
}
