package com.rifqi.Soal3;

public class Pacar extends Mahasiswa{
    public String namaPacar, lamaHubungan;

    public Pacar(String nama, String status, int semester, String namaPacar, String lamaHubungan) {
        super(nama, status, semester);
        this.namaPacar = namaPacar;
        this.lamaHubungan = lamaHubungan;
    }

    @Override
    public void getStatus() {
        super.getStatus();
        System.out.println("Nama Pacar : "+namaPacar);
        System.out.println("Lama Hubungan : "+lamaHubungan);
    }
}
