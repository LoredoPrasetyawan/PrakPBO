package com.LoredoPrasetyawan.Pertemuan_1.Praktikum;

public class Passed {
    public static void main(String[] args) {
        int nomor1, nomor2, nomor3; //tipe data primitif
        TestPass pass = new TestPass(13, 77, 91); //Dleklarasi object
        nomor1 = 10;
        nomor2 = 20;
        nomor3 = 30;

        //Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("nomor1 = " + nomor1);
        System.out.println("nomor2 = " + nomor2);
        System.out.println("nomor3 = " + nomor3);

        pass.calculate(nomor1,nomor2,nomor3); //meanggil pass dgn method calculate
        System.out.println("Nilai sesudah passed by value: ");
        System.out.println("nomor1 = " + nomor1);
        System.out.println("nomor2 = " + nomor2);
        System.out.println("nomor3 = " + nomor3);

        System.out.println();

        //Passed by reference
        System.out.println("Nilai sebelum passed by reference");
        System.out.println("pass.nomor1 = " + pass.nomor1);
        System.out.println("pass.nomor2 = " + pass.nomor2);
        System.out.println("pass.nomor3 = " + pass.nomor3);

        pass.calculate(pass);
        System.out.println("Nilai sesudah passed by reference");
        System.out.println("pass.nomor1 = " + pass.nomor1);
        System.out.println("pass.nomor2 = " + pass.nomor2);
        System.out.println("pass.nomor3 = " + pass.nomor3);

    }
}
