/**
 * Buku
 */
package Percobaan2;
public class Buku20 {
    int kodeBuku, tahunTerbit, stock;
    String judulBuku, pengarang, penerbit;

    public Buku20(int kodeBuku, String judulBuku, String pengarang, int tahunTerbit, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;

        this.tahunTerbit = tahunTerbit;
        this.stock = stock;
    }

    // fUNGSI TAMPIL
    public void tampil() {
        System.out.println("=============");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judulBuku);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Stock : " + stock);
    }

    // tampil data buku
    public void tampilBuku(int x, int pos) {
        if (pos != -1) {
            System.out.println("=============");
            System.out.println("Kode Buku : " + kodeBuku);
            System.out.println("Judul Buku : " + judulBuku);
            System.out.println("Pengarang : " + pengarang);
            System.out.println("Tahun Terbit : " + tahunTerbit);
            System.out.println("Stock : " + stock);
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
}