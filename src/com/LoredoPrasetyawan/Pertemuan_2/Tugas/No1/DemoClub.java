package com.LoredoPrasetyawan.Pertemuan_2.Tugas.No1;

public class DemoClub {
    public static void main(String[] args) {

        // Objek Club
        club club1 = new club();
        club club2 = new club("Persib");
        club club3 = new club("Persib",
                " Persib bandung adalah sebuah klub sepak bola asal Bandung yang berbasis di Kota Bandung.");
        club club4 = new club("Persib", 1892, "GBLA");
        club club5 = new club("Persib", 1892, "GBLA",
                6, "Persib bandung adalah sebuah klub sepak bola asal Bandung yang berbasis di Kota Bandung.");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
