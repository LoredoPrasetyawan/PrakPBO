package com.LoredoPrasetyawan.Pertemuan_4.Tugas.no1;


import java.util.Random;

public class DemoSatu {
    public static void main(String[] args) {
        Employee[] employee = {
                new Commision("Loredo", "1029384899", 400000, 550000, 15, 2),
                new Salaried("Prasetyawan", "1029384899", 150000, 70000, 25, 7),
                new ProjectPlanner("LoredoPrasetyawan", "1029384899", 220000, 80000, 10, 5)};

        Random pilihan = new Random();
        Employee pegawai = employee[pilihan.nextInt(employee.length)];

        System.out.println("Gaji Karyawan");
        pegawai.getGaji();
    }
}
