package Jobsheet2.Percobaan;

public class BukuMain20 {
    public static void main(String[] args) {
        
        Buku20 buku1 = new Buku20();
        buku1.judul = "Today ends Tomorrow Comes";
        buku1.pengarang = "Denanda Pratiwi";
        buku1.halaman = 198;
        buku1.stok = 13;
        buku1.harga = 71000;

        buku1.tampilInformasi();
        buku1.terjual(5);
        buku1.gantiHarga(60000);
        buku1.tampilInformasi();
    }
    
}
