package com.LoredoPrasetyawan.Pertemuan_3.Praktikum.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Paijo");
        mahasiswa.setNim(1907726);

        Mahasiswa mahasiswa1 = new Mahasiswa(1907725, "Opah");

        Dosen dosen = new Dosen();
        dosen.setKode("ACW");
        dosen.setNimMHS(mahasiswa.getNim());
        dosen.setNimMHS(mahasiswa1.getNim());

        System.out.println("Kode Dosen\t: " + dosen.getKode());
        System.out.println("Mengajar Mahasiswa\t: ");

        for (int i = 0; i < dosen.getJmlMahasiswa(); i++) {
            System.out.println("- " + dosen.getnims(i));
        }
    }
}
