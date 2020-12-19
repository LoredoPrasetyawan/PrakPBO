package com.LoredoPrasetyawan.Pertemuan_4.Praktikum.Abstrak;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] peliharaan = {
                new Burung("beo"),
                new Kambing("etawa"),
                new Kucing("persia"),
                new Anjing("cihua")
        };

        Binatang kesayangan;

        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("binatang kesayangan anda\t ");
        System.out.println("suaranya\t: ");
        kesayangan.suara();
    }
}
