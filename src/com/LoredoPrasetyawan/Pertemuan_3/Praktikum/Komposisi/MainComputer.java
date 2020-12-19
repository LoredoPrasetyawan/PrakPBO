package com.LoredoPrasetyawan.Pertemuan_3.Praktikum.Komposisi;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer= new Computer("gaming");


        Keyboard keyboard = new Keyboard("Asus","Mechanical");
        Mouse mouse = new Mouse("odading","24");
        Monitor monitor = new Monitor("Armageddon","24","144");
        Cpu cpu = new Cpu("Intel","Nvidia 3070","16");

        computer.addComponent(keyboard,mouse,monitor,cpu);

        System.out.println("type Computer\t: " + computer.getType());
        System.out.println();

        System.out.println("Keyboard\t: ");
        computer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t: ");
        computer.getMouse().PrintSpec();

        System.out.println("Monitor\t: ");
        computer.getMonitor().PrintSpec();

        System.out.println("Cpu\t: ");
        computer.getCpu().PrintSpec();
    }
}
