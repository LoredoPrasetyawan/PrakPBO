package com.LoredoPrasetyawan.Pertemuan_5.Praktikum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Try_Catch {
    public static void main(String[] args) {
        File file = new File("D:\\apa\\Paimon.txt");
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("Read file berhasil");
        } catch (FileNotFoundException e) {
            System.out.println("Gaada Filenya!");
        }
    }
}
