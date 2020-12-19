package com.LoredoPrasetyawan.Pertemuan_1.Praktikum;

//ibarat rumah program
public class Kelas {
    private static String nama = "Ghost";
    //selain void jgn lupa pake return
    private static int setMinute(){
        int minute = 15;
        return minute;
    }

    public static void main(String[] args) {
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Set Minute\t: " + setMinute());
    }
}
//di OOP, antara class 1 dan lain , dari file 1 dan yg lain saling terhubung
