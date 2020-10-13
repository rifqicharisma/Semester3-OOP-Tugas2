package com.rifqi.Soal2;

public class DemoBinatang {
    public static void main(String[] args) {
        Binatang binatang = new Binatang();
        Burung burung = new Burung();
        Ikan ikan = new Ikan();
        Kucing kucing = new Kucing();

        binatang.getNama("Gorila");
        System.out.println();
        burung.getNama("Kenari");
        System.out.println();
        ikan.getNama("Cupang");
        System.out.println();
        kucing.getNama("Spinx");
    }
}
