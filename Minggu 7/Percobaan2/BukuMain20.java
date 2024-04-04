package Percobaan2;
import java.util.Scanner;

public class BukuMain20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        PencarianBuku20 data = new PencarianBuku20();

        int jumBuku =5;
        // System.out.println("----------------------------------------------------");
        // System.out.println("Masukan Data buku dari yang terkecil");
        // for(int i=0; i<jumBuku; i++){
        //     System.out.println("----------------------------------------------------");
        //     System.out.print("Masukan kode buku : ");
        //     int kode = s.nextInt();
        //     System.out.print("Masukan judul buku : ");
        //     String judul = s1.nextLine();
        //     System.out.print("Masukan pengarang buku : ");
        //     String pengarang = s1.nextLine();
        //     System.out.print("Masukan tahun terbit buku : ");
        //     int tahun = s.nextInt();
        //     System.out.print("Masukan stock buku : ");
        //     int stock = s.nextInt();
        //     Buku20 bk = new Buku20(kode, judul, pengarang, tahun, stock);
        //     data.tambah(bk);
        // }
        System.out.println("----------------------------------------------------");
        System.out.println("Data Keseluruh Buku");
        data.tampil();

        System.out.println("----------------------------------------------------");
        System.out.println("Masukan kode buku yang dicari : ");
        int cari = s.nextInt();
        System.out.println("----------------------------------------------------");
        int pos = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, pos);
        System.out.println("----------------------------------------------------");
        System.out.println("Mencari Buku Dengan Binary Search");
        pos = data.FindBinarySearch(cari, 0, jumBuku-1);
        data.TampilPosisi(cari, pos);
        System.out.println("----------------------------------------------------");
        System.out.println("Data Buku yang dicari di pertanyaan 3 percobaan 1");
        Buku20 dataBuku= data.FindBuku(cari);
        dataBuku.tampil();
        System.out.println("----------------------------------------------------");
    }
    
}
