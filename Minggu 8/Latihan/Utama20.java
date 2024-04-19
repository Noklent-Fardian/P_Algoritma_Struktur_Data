package Latihan;

import java.util.Scanner;

public class Utama20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int kapasitas;
        System.out.print("Masukkan Kapasitas Gudang: ");
        kapasitas = input20.nextInt();
        Gudang20 gudang = new Gudang20(kapasitas);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Tampilkan Barang Teratas");
            System.out.println("5. Tampilkan Tumpukan Terbawah");
            System.out.println("6. Cari Barang Dengan Nama Atau Kode ");
            System.out.println("7. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input20.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Barang: ");
                    int kode = input20.nextInt();
                    input20.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String nama = input20.nextLine();
                    System.out.print("Masukkan Kategori Barang: ");
                    String kategori = input20.nextLine();
                    Barang20 barangBaru = new Barang20(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        }
    }
}
