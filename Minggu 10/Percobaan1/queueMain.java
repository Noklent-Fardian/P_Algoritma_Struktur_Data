package Percobaan1;

import java.util.Scanner;

public class queueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print ("Masukan Kapasitas Queue: ");
        int n = sc.nextInt();
        queue Q = new queue(n);

        do{
            menu();
             pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukan Data Baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.enQueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.deQueue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while(pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5);
    }
    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. clear");
        System.out.println("Pilihan: ");
    }
}
