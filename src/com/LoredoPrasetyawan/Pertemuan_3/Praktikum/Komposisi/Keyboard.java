package com.LoredoPrasetyawan.Pertemuan_3.Praktikum.Komposisi;

public class Keyboard {
    private String merk;
    private String type;

    public Keyboard(String merk, String type){
        this.merk = merk;
        this.type = type;
    }
    public void PrintSpec(){
        System.out.println("- merk\t: "+ merk);
        System.out.println("- type\t: "+ type);
        System.out.println();
    }
}
