/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class tanaman {
 // Atribut
    private final String nama;
    private final String jenis;
    private final int tinggi;

    // Konstruktor
    public tanaman(String nama, String jenis, int tinggi) {
        this.nama = nama;
        this.jenis = jenis;
        this.tinggi = tinggi;
    }

    // Metode untuk menampilkan informasi tanaman
    public void tampilkanInfo() {
        System.out.println("Nama Tanaman: " + nama);
        System.out.println("Jenis Tanaman: " + jenis);
        System.out.println("Tinggi Tanaman: " + tinggi + " cm");
    }   
}
