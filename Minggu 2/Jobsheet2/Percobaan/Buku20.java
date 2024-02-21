package Jobsheet2.Percobaan;


public class Buku20 {

    String judul;
    public String pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok habis");
            
        }
    }

    void restock(int n) {

    }

    void gantiHarga(int hrg) {

    }

}