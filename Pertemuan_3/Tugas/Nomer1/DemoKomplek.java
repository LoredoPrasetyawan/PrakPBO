package com.LoredoPrasetyawan.Pertemuan_3.Tugas.Nomer1;

public class DemoKomplek {
    public static void main(String[] args) {

        // Komplek constructor
        Komplek komplek = new Komplek("130701", "Rumah Sultan");

        // Rumah constructors
        Rumah rumah1 = new Rumah("MTN - 01", "Mafia", 4);
        Rumah rumah2 = new Rumah("MTN - 02", "Depkolektor", 5);
        Rumah rumah3 = new Rumah("PJBT - 01", "Mentri kelautan", 3);
        Rumah rumah4 = new Rumah("PJBT - 02", "Mentri pendidikan", 2);

        // Associate all 'rumah' objects with the one and only 'komplek' object
        komplek.addRumah(rumah1.getIdRumah());
        komplek.addRumah(rumah2.getIdRumah());
        komplek.addRumah(rumah3.getIdRumah());
        komplek.addRumah(rumah4.getIdRumah());

        // A new household enters the suburb. Register it immediately!
        komplek.addRumah(new Rumah("MTN - 03", "Konglomerat", 2).getIdRumah());

        // Prints out the final house data
        komplek.getDataKomplek();
    }
}
