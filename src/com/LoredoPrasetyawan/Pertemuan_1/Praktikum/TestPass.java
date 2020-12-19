package com.LoredoPrasetyawan.Pertemuan_1.Praktikum;

public class TestPass {
    int nomor1;
    int nomor2;
    int nomor3;

    //constuctor
    public TestPass(int nomor1, int nomor2, int nomor3) {
        this.nomor1 = nomor1;
        this.nomor2 = nomor2;
        this.nomor3 = nomor3;
    }
    //Pass by value, indentik dgn parameter dg variable primitif
    //kalo gapake return, isi datanya bakal stay dan di demo yg class file lain gabakal keubah
    public void calculate(int m, int n, int x){
        m = m * 10;
        n = n / 2;
        x = x + 5;
    }
    //Pass by Reference, merujuk ke tipe data class/buatan/reference yg kita buat dengan nama vaariable pass
    //kalo yg referense, kemana mana bakal berubah karna manggilnya tetep ke pass
    public void calculate(TestPass pass){
        pass.nomor1 = pass.nomor1 * 10;
        pass.nomor2 = pass.nomor2 / 3;
        pass.nomor3 = pass.nomor3 + 7;
}
}
//constructor= method yg sama dgn nama kelasnya, membuat suatu objek dr kelas yg dibuat. untuk manggil kita deklarasi objek