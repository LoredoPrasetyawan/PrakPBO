package com.LoredoPrasetyawan.Pertemuan_1.Praktikum;

//sebaggai class main/demoklas/klas yg menjalankan
public class Objek {
    public static void main(String[] args) {
        //Deklarasi object tanpa parameter
        //jika memanggil method yg gaada parameternya, deklarasikan objeknya yg gaada parameternya
        Mahasiswa mahasiswaTanpa = new Mahasiswa();
        //memanggil method yg dimahasiswa dengan mengisi objeknya
        mahasiswaTanpa.setNama("Loredo");
        mahasiswaTanpa.setNim(19104050);
        //output
        System.out.println("Mahasiswa 1");
        System.out.println("Nama\t: " + mahasiswaTanpa.getNama());
        System.out.println("Nim\t\t: " + mahasiswaTanpa.getNim());

        //Deklarasi objek pake parameter, tanpa setter, setter dipake jika mau mengubah parameter settnya
        Mahasiswa mahasiswa = new Mahasiswa("Loredo",19104050);

        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t\t: " + mahasiswa.getNim());
    }

}
//Setter = tadinya kosong, diisi pake tipe data yg ditentukan
//getter = mengambil data nya