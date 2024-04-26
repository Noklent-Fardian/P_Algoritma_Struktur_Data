package Percobaan2;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan kapasitas queue: ");
        int jumlah = sc.nextInt();
        queue antri = new queue(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukan data baru: ");
                    System.out.print("Norek: ");
                    String norek = sc.next();
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("Alamat: ");
                    String alamat = sc.next();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc.nextDouble();

                    Nasabah nas = new Nasabah(norek, nama, alamat, umur, saldo);
                    antri.enQueue(nas);
                    break;
                case 2:
                    Nasabah data = antri.deQueue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Data yang dikeluarkan: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekrear();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Tampilkan Antrian");
        System.out.println("5. Tampilkan Antrian Paling Belakang");
        System.out.println("---------------");
    }

}
