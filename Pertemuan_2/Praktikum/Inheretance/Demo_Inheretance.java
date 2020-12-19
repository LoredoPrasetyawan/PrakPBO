package com.LoredoPrasetyawan.Pertemuan_2.Praktikum.Inheretance;

public class Demo_Inheretance {
    public static void main(String[] args) {
        A superClass = new A();
        B subClass = new B();

        System.out.println("Masukin data ke SuperClass");
        superClass.x = 10;
        superClass.y = 50;
        superClass.printXY();


        System.out.println("Masukin data ke SubClass");
        subClass.x = 30;
        subClass.y = 40;
        subClass.z = 10;
        subClass.printXY();
        subClass.sumValue();


    }
}
