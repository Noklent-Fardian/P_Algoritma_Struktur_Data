package Latihan;

import java.util.Scanner;

public class BukuMain20 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        PencarianBuku20 data = new PencarianBuku20();
        int jumBuku = 6;
        // System.out.println("----------------------------------------------------");
        // System.out.println("Masukan Data buku dari yang terkecil");
        // for(int i=0; i<jumBuku; i++){
        // System.out.println("----------------------------------------------------");
        // System.out.print("Masukan kode buku : ");
        // int kode = s.nextInt();
        // System.out.print("Masukan judul buku : ");
        // String judul = s1.nextLine();
        // System.out.print("Masukan pengarang buku : ");
        // String pengarang = s1.nextLine();
        // System.out.print("Masukan tahun terbit buku : ");
        // int tahun = s.nextInt();
        // System.out.print("Masukan stock buku : ");
        // int stock = s.nextInt();
        // Buku20 bk = new Buku20(kode, judul, pengarang, tahun, stock);
        // data.tambah(bk);
        // }
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("Data Keseluruh Buku");
            data.tampil();
            System.out.println("----------------------------------------------------");
            System.out.println("Pencarian Data Buku");
            System.out.println("1. Pencarian Data Buku dengan kode buku");
            System.out.println("2. Pencarian Data Buku dengan judul buku");
            int pilih = s1.nextInt();
            s1.nextLine();
            switch (pilih) {
                case 1:
                    data.BubbleSort();
                    data.tampil();
                    System.out.print("Masukan kode buku yang dicari : ");
                    String cari = s1.nextLine();
                    data.clear();
                    System.out.println("----------------------------------------------------");
                    System.out.println("Mencari dengan Sequential Search");
                    int pos = data.FindSeqSearch(cari);
                    data.TampilPosisi(cari, pos);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Mencari dengan Binary Search");
                    pos = data.FindBinarySearch(cari, 0, jumBuku - 1);
                    data.TampilPosisi(cari, pos);
                    break;
                case 2:
                    data.SelectionSort();
                    data.tampil();
                    System.out.print("Masukan judul buku yang dicari : ");
                    String cari2 = s1.nextLine();
                    data.clear();
                    System.out.println("----------------------------------------------------");
                    System.out.println("Mencari dengan Sequential Search");
                    int pos2 = data.FindSeqSearchByJudul(cari2);
                    data.TampilPosisi(cari2, pos2);
                    System.out.println("----------------------------------------------------");
                    System.out.println("Mencari dengan Binary Search");
                    int pos4 = data.FindBinarySearchByJudul(cari2, 0, jumBuku - 1);
                    data.TampilPosisi(cari2, pos4);

                    break;
                default:
                    System.out.println("Pilihan tidak ada");
            }
        } while (true);
    }

}
