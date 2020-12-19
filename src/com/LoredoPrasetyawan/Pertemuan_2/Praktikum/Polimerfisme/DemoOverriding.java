package com.LoredoPrasetyawan.Pertemuan_2.Praktikum.Polimerfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X superClass = new X();
        Y subClass = new Y();

        superClass.getValue("Tidur");
        subClass.getValue("Makan");
    }
}
