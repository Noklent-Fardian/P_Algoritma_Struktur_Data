import java.util.Scanner;

public class MainAksesoris20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        Aksesoris20[] aksesoris20 = new Aksesoris20[5];
        for (int i = 0; i < aksesoris20.length; i++) {
            aksesoris20[i] = new Aksesoris20();
            System.out.print("Masukkan Nama Aksesoris ke - " + (i + 1) + " : ");
            aksesoris20[i].nama20 = input20.nextLine();
            System.out.print("Masukkan Kategori Aksesoris ke - " + (i + 1) + " : ");
            aksesoris20[i].kategori20 = input20.nextLine();
            System.out.print("Masukkan Harga Aksesoris ke - " + (i + 1) + " : ");
            aksesoris20[i].harga20 = input20.nextInt();
            System.out.print("Masukkan Terjual Aksesoris ke - " + (i + 1) + " : ");
            aksesoris20[i].terjual20 = input20.nextInt();
            input20.nextLine();
            System.out.println("=====================================");

        }
        boolean ulang20 = true;
        do {
            Aksesoris20 aksesoris = new Aksesoris20();
        aksesoris.tampil20(aksesoris20);

        System.out.println("Pilih Menu:");
        System.out.println("1. Hitung Total Penjualan");
        System.out.println("2. Urutkan Berdasarkan Harga Termurah");
        System.out.println("3. Urutkan Berdasarkan Nama");

        System.out.print("Masukkan Pilihan : ");

        int pilihan20 = input20.nextInt();
            switch (pilihan20) {
                case 1:
                    System.out.println("Total Penjualan Rp. " + aksesoris.hitungTotalPenjualan20(aksesoris20));
                break;
                case 2:
                    aksesoris.cariAksesorisTermurah20(aksesoris20);
                    aksesoris.tampil20(aksesoris20);
                    break;
                case 3:
                    aksesoris.daftarAksesoris20(aksesoris20);
                    aksesoris.tampil20(aksesoris20);
                    break;
                default:
                    break;
            }
        } while (ulang20==true);
    }

}
