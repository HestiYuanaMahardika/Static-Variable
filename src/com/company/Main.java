// Static Variable

package com.company;

class Petugas{

    // Atribut
    static String space;
    static String bagian;
    String nama;
    int nip;
    int usia;
    String tempat_lahir;
    String agama;
    String alamat;
    String keterangan;

    // Constructor
    Petugas(String nama, int nip, int usia, String tempat_lahir, String agama, String alamat, String keterangan){
        this.nama = nama;
        this.nip  = nip;
        this.usia = usia;
        this.tempat_lahir = tempat_lahir;
        this.agama = agama;
        this.alamat = alamat;
        this.keterangan = keterangan;
    }

    // Method
    void tampilData(){
        System.out.println("Nama Petugas \t : "+ nama);
        System.out.println("Ruang \t\t\t : "+ Petugas.space);
        System.out.println("NIP \t\t\t : " + nip);
        System.out.println("Usia \t\t\t : " + usia);
        System.out.println("Tempat Lahir \t : " + tempat_lahir);
        System.out.println("Agama \t\t\t : " + agama);
        System.out.println("Alamat \t\t\t : " + alamat);
        System.out.println("Keterangan \t\t : " + keterangan + "\n");
    }

}

public class Main {

    public static void main(String[] args) {

        // Intansiasi
        Petugas.space = "Pengolahan dan Pengembangan Koleksi Buku";

        Petugas petugas1 = new Petugas ("Nugroho", 2015061005, 32, "Bandar Lampung", "Islam", "Natar", "Aktif");
        Petugas petugas2 = new Petugas( "Yuana", 2015061010, 30, "Bandar Lampung", "Islam", "Metro", "Aktif");

        petugas1.nama = "Wildan";
        petugas2.nama = "Azelia";

        petugas1.space = "Layanan Sirkulasi";   // Tidak direkomendasikan

        // Panggil Method
        petugas1.tampilData();
        petugas2.tampilData();

    }
}
