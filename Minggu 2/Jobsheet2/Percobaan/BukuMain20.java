package Jobsheet2.Percobaan;

public class BukuMain20 {
    public static void main(String[] args) {
        
        // Buku20 buku1 = new Buku20();
        // buku1.judul = "Today ends Tomorrow Comes";
        // buku1.pengarang = "Denanda Pratiwi";
        // buku1.halaman = 198;
        // buku1.stok = 13;
        // buku1.harga = 71000;

        // buku1.tampilInformasi();
        // buku1.terjual(5);
        // buku1.gantiHarga(60000);
        // buku1.tampilInformasi();
        
        // Buku20 bk2 = new Buku20("Self Reward", " Maheera Ayesha",160,29,59000);
        // bk2.terjual(11);
        // bk2.tampilInformasi();
        System.out.println("================================================================Tugas Percoban 3================================================================");
        Buku20 BukuNoklent = new Buku20("Noklent World 616", 200, 80000, 10, "Noklent");
        BukuNoklent.terjual(2);
        BukuNoklent.tampilInformasi();
        BukuNoklent.tampilHargaBayar(2);

    }
    
}
