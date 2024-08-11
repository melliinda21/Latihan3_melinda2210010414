/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class tanamantumbuhan {
    public static void main(String[] args) {
        // Membuat objek dari kelas Tanaman
        tanaman tanaman1 = new tanaman("Mawar", "Bunga", 50);
        tanaman tanaman2 = new tanaman("Mangga", "Pohon Buah", 300);

        // Menampilkan informasi tanaman
        tanaman1.tampilkanInfo();
        System.out.println(); // Menambah baris kosong antara dua informasi tanaman
        tanaman2.tampilkanInfo();
    } 
}
