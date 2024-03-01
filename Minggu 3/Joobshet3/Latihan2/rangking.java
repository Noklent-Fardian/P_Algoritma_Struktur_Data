package Joobshet3.Latihan2;

import java.util.Scanner;

public class rangking {
    public static void main(String[] args) {
        // instansiasi dkk
        Hitung [] hitung;
        System.out.println("========= Menghitung Rangking Nilai ===========");
        System.out.print("Masukan Jumlah Mahasiswa :");
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();
        hitung = new Hitung[jumlah];
        Hitung h = new Hitung();

        // Input
        System.out.println("Inputkan Data Mahasiswa");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.next();
            System.out.print("Jenis Kelamin: ");
            String kelamin = input.next();
            System.out.print("NIM: ");
            String nim = input.next();
            System.out.print("IPK(Tulis Angka saja): ");
            double nilai = input.nextInt();
            hitung[i] = new Hitung(nama, nim, nilai,kelamin);
        }
        // Proses Perangkingan
        h.hitungRangking(hitung);
         // Print Hasil
        System.out.println("============ HASIL RANGKING ===========");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Rangking ke-" + (i+1));
            hitung[i].cetak();
        }
        h.ratarata(hitung);


    }
    
}
