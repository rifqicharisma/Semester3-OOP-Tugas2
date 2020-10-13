package com.rifqi.Soal3;

public class Mahasiswa {
    public String nama, status;
    public int semester;

    public Mahasiswa(String nama, String status, int semester) {
        this.nama = nama;
        this.status = status;
        this.semester = semester;
    }

    public void getStatus(){
        System.out.println("Nama : "+nama);
        System.out.println("Status : "+status);
        System.out.println("Semester : "+semester);
    }
}
