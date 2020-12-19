package com.LoredoPrasetyawan.Pertemuan_3.Tugas.Nomer3;

import java.util.List;
import java.util.ArrayList;

public class RumahTangga {
    public static void main(String[] args) {

        // Constructs a family object
        Keluarga keluarga = new Keluarga("Yanto's", "Jawa Tengah");

        // Construct family members (components)
        Ayah ayah = new Ayah(1001, "Yanto", 45);
        Ibu ibu = new Ibu(2001, "Susi", 37);
        Anak anak1 = new Anak(3001, "Putra", 10, "Pelajar");
        Anak anak2 = new Anak(3002, "Putri", 8, "Pelajar");


        List<Anak> anakList = new ArrayList<>();


        anakList.add(anak1);
        anakList.add(anak2);


        keluarga.addAnggotaKeluarga(ayah, ibu, anakList);

        keluarga.getDataKeluarga();
    }
}
