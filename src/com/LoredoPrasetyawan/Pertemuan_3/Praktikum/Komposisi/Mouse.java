package com.LoredoPrasetyawan.Pertemuan_3.Praktikum.Komposisi;

public class Mouse {
    private String merk;
    private String dpi;

    public Mouse(String merk, String dpi){
        this.merk = merk;
        this.dpi = dpi;
    }
    public void PrintSpec(){
        System.out.println("- merk\t "+ merk);
        System.out.println("- DPI\t");
        System.out.println();
    }
}
