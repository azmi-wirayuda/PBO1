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
public interface mahasiswa {

public class Mahasiswa {
    // Atribut (bersifat private)
    private String nama;
    private int umur;

    // Konstruktor
    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Method tambahan untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek mahasiswa menggunakan konstruktor
        Mahasiswa mhs1 = new Mahasiswa("Budi", 20);

        // Menampilkan data awal
        mhs1.tampilkanInfo();

        // Mengubah data menggunakan setter
        mhs1.setNama("Andi");
        mhs1.setUmur(21);

        // Mengakses data menggunakan getter
        System.out.println("\nSetelah diubah:");
        System.out.println("Nama baru: " + mhs1.getNama());
        System.out.println("Umur baru: " + mhs1.getUmur());

        // Menampilkan data akhir
        mhs1.tampilkanInfo();
    }
}
}
