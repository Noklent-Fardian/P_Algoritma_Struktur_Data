package Jobsheet2.Percobaan;

public class Buku20 {

    String judul;
    public String pengarang;
    int halaman, stok, harga;

    public Buku20() {

    }

    public Buku20(String jud, int hal, int harga, int stok, String pg) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        this.harga = harga;
    }

    public Buku20(String jud, String pg, int hal, int stok, int har) {
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
        if (stok == 0 ) {
            System.out.println("Stok Habis");
        } else {
            System.out.println("Stok: " + stok);
        }

        System.out.println("Harga: Rp " + harga);
    }

    int terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            return stok -= jml;
        } else {
            return stok = 0;

        }
    }

    void restock(int n) {

    }

    void gantiHarga(int hrg) {

    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int jml) {
        if (hitungHargaTotal(jml) > 150000) {
            return (int) (hitungHargaTotal(jml) * 0.12);
        } else if (hitungHargaTotal(jml) > 75000 && hitungHargaTotal(jml) <= 150000) {
            return (int) (hitungHargaTotal(jml) * 0.05);
        } else {
            System.out.println("Diskon: Rp 0");
            return 0;
        }

    }
    int hitungHargaBayar(int jml) {
        return hitungHargaTotal(jml) - hitungDiskon(jml);
    }
    void tampilHargaBayar(int jml) {
        System.out.println("Harga Total: Rp " + hitungHargaTotal(jml));
        System.out.println("Diskon: Rp " + hitungDiskon(jml));
        System.out.println("Harga Bayar: Rp " + hitungHargaBayar(jml));
    }

}