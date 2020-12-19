package com.LoredoPrasetyawan.Pertemuan_4.Praktikum.Interface;

public class ChildCD extends CD implements InterfaceCD{
    public ChildCD(String ukuran, long hargaCD) {
        super(ukuran, hargaCD);
    }

    @Override
    public long getHargaCD() {
        return 0;
    }

}
