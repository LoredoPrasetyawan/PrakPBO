package com.LoredoPrasetyawan.Pertemuan_4.Praktikum.Interface;

public class DemoInterface {
    public static void main(String[] args) {
        Paket paketA = new Paket("Kunci Sukses", "Wong edan", 1000000000, "50", 10000000);

        paketA.hitungHargaPaket();
        paketA.cetakPaket();
    }
}
