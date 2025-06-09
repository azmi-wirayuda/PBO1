/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Asus
 */
public interface ujicoba {
 // Class Pemilik
class Pemilik {
    String nama;
    int umur;
    String alamat;

    Pemilik(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    void infoPemilik() {
        System.out.println("Nama Pemilik: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
}

// Class Kucing
class Kucing {
    String nama;
    String ras;
    int umur;

    Kucing(String nama, String ras, int umur) {
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
    }

    void infoKucing() {
        System.out.println("Nama Kucing: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Umur: " + umur + " tahun");
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Pemilik pemilik1 = new Pemilik("Alya", 25, "Jl. Mawar No. 10");
        Kucing kucing1 = new Kucing("Milo", "Persia", 3);

        pemilik1.infoPemilik();
        System.out.println();
        kucing1.infoKucing();
    }
}


    
}
