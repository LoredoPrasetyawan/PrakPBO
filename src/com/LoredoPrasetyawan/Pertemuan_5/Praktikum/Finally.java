package com.LoredoPrasetyawan.Pertemuan_5.Praktikum;

public class Finally {
    public static void main(String[] args) {
        int [] array = new int[5];

        try{
            //Database buka
            System.out.println("Akses Elemen Ke-5\t: " + array[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ada exception Array ");
        }finally {
            array[array.length - 1] = 10;
            System.out.println("Nilai Elemen terakhir\t: " + array[array.length -1]);
        }
    }
}
