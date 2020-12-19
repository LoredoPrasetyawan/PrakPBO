package com.LoredoPrasetyawan.Pertemuan_1.Praktikum;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia arrayManusia[] = new  Manusia[3];

        Manusia manusia1 = new Manusia(); // construktur pertama
        manusia1.setNama("Sarah");
        manusia1.setUmur(21);

        Manusia manusia2 = new Manusia("Sofia",10); //construktur kedua
        Manusia manusia3 = new Manusia("Asrifah",18);//construktur ketiga


        arrayManusia[0] = manusia1;
        arrayManusia[1] = manusia2;
        arrayManusia[2] = manusia3;

        for (Manusia x : arrayManusia) {
            System.out.println("Character");
            System.out.println("Nama\t: "+x.getNama());
            System.out.println("Umur\t: "+x.getUmur());
        }
    }
}
