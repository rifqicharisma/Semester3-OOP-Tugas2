package com.rifqi.Soal1;

public class Club {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskripsi;

    public Club() {
    }

    public Club(String nama) {
        this.nama = nama;
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam(){
        if(nama == null){
            nama = "Agus";
        }
        if (stadion==null){
            stadion = "San Marino";
        }
        if(deskripsi==null){
            deskripsi = "Mainnya hebat";
        }
        if (tahunBerdiri==0){
            tahunBerdiri = 1945;
        }
        if (juaraUcl==0){
            juaraUcl = 2;
        }
        System.out.println("Nama : "+nama);
        System.out.println("Stadion : "+ stadion);
        System.out.println("Deskripsi : "+deskripsi);
        System.out.println("Tahun Berdiri : "+ tahunBerdiri);
        System.out.println("Juara UCL : "+juaraUcl);
    }
}
