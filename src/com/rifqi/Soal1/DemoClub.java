package com.rifqi.Soal1;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club("Bambang", 123,"bung bungan", 123, "agus yudi");Club club2 = new Club("Bambang", "Feeder auto kick");
        Club club3 = new Club("Bambang", 2013, "Gelora Bung Karno");
        Club club4 = new Club("Bambang", 1234, "Sisingamangaraja",4, "Feeder auto bantai");
        Club club5 = new Club("Bambang", 234, "Bung Hatta",3, "Feeder buang aja");

        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
