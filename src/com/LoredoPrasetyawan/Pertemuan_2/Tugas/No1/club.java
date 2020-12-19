package com.LoredoPrasetyawan.Pertemuan_2.Tugas.No1;

public class club {
    String nama;
    int tahunBerdiri;
    String stadion;
    int juaraUcl;
    String deskripsi;


    public club() {
    }
    public club(String nama) {
        this.nama = nama;
    }

    public club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }
    public club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }
    public club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }
    public void getTeam(){
        System.out.println("Nama Club\t\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + tahunBerdiri);
        System.out.println("Nama Stadion\t: " + stadion);
        System.out.println("Juara UCL\t\t: " + juaraUcl);
        System.out.println("Deskripsi Club\t: " + deskripsi);
    }
}
