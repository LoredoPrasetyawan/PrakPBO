package com.LoredoPrasetyawan.Pertemuan_4.Tugas.no1;

public class Salaried extends Employee{
    public Salaried(String nama, String nip, float upah, float komisi, float total_penjualan, float total_proyek) {
        super(nama, nip, upah, (float) 0, (float) 0, (float) 0);
    }

    @Override
    public void getGaji() {
        System.out.println("Total Gaji  " + this.nama + " : Rp " + this.upah);
    }

}
