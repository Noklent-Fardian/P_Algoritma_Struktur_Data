package Jobsheet2.Percobaan;


public class Buku20 {

    String judul;
    public String pengarang;
    int halaman, stok, harga;

    public Buku20() {

    }

    public Buku20(String jud, String pg, int hal, int stok,int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
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