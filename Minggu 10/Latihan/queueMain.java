package Latihan;

import java.util.Scanner;

public class queueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = sc.nextInt();
        queue Q = new queue(n);
        int pilih;
        
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    sc.nextLine();
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nomor HP: ");
                    int noHP = sc.nextInt();
                    pembeli data = new pembeli(nama, noHP);
                    Q.enqueue(data);
                    break;
                case 2:
                    pembeli dataOut = Q.dequeue();
                    if(dataOut != null){
                        System.out.println("Data yang dikeluarkan: " + dataOut.nama + " " + dataOut.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    System.out.println("Masukkan nama pembeli yang dicari: ");
                    sc.nextLine();
                    nama = sc.nextLine();
                    Q.peekPosition(nama);
                    break;
                case 5:
                    Q.print();
                    break;
                case 6:
                    Q.peekRear();
                    break;
            }
        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5|| pilih == 6);
        
    }

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Hapus antrian");
        System.out.println("3. Lihat antrian terdepan");
        System.out.println("4. Lihat posisi antrian Pembeli");
        System.out.println("5. Lihat semua antrian");
        System.out.println("6. Lihat posisi antrian tertbelakang");
        System.out.println("--------------------------------------");
    }
    
}
