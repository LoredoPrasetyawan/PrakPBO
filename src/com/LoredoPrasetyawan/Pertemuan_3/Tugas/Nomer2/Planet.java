package com.LoredoPrasetyawan.Pertemuan_3.Tugas.Nomer2;

public class Planet {
    private int idPlanet;
    private int urutanPlanet;
    private String namaPlanet;

    // Constructor
    public Planet(int idPlanet, int urutanPlanet, String namaPlanet) {
        this.idPlanet = idPlanet;
        this.urutanPlanet = urutanPlanet;
        this.namaPlanet = namaPlanet;
    }

    // Returns the planet's ID
    public int getIdPlanet() {
        return idPlanet;
    }

    // Sets the planet's ID
    public void setIdPlanet(int idPlanet) {
        this.idPlanet = idPlanet;
    }

    // Returns the planet's order
    public int getUrutanPlanet() {
        return urutanPlanet;
    }

    // Sets the planet's order
    public void setUrutanPlanet(int urutanPlanet) {
        this.urutanPlanet = urutanPlanet;
    }

    // Returns the planet's name
    public String getNamaPlanet() {
        return namaPlanet;
    }

    // Sets the planet's name
    public void setNamaPlanet(String namaPlanet) {
        this.namaPlanet = namaPlanet;
    }
}
