package com.rifqi.Soal3;

public class DemoPacar {
    public static void main(String[] args) {
        Mahasiswa parent = new Mahasiswa("Supangat", "Belum Kawin", 3);
        Pacar child = new Pacar("Agus", "belum kawin", 5, "bambang", "5 tahun");

        parent.getStatus();
        System.out.println();
        child.getStatus();
    }
}
