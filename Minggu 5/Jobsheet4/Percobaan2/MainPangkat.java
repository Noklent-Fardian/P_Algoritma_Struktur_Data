package Jobsheet4.Percobaan2;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = scanner.nextInt();
        Pangkat[] png = new Pangkat[elemen];
        isiElement(png, elemen, scanner);
        menu(png, elemen);

        // for (int i = 0; i < elemen; i++) {
        // png[i] = new Pangkat(i,i);
        // System.out.print("Masukkan nilai yang akan dipangkatkan : ");
        // png[i].niai = scanner.nextInt();
        // System.out.print("Masukkan nilai pemangkat : ");
        // png[i].pangkat = scanner.nextInt();
        // }
        // System.out.println("=============================================================");
        // System.out.println("Hasil Pangkat dengan Brute Force");
        // for (int i = 0; i < elemen; i++) {
        // System.out.println("Hasil Dari "
        // +png[i].niai+" Pangkat "
        // +png[i].pangkat+" adalah : "
        // +png[i].pangkatBF(png[i].niai, png[i].pangkat));
        // }
        // System.out.println("=============================================================");
        // System.out.println("Hasil Pangkat dengan Divide and Conquer");
        // for (int i = 0; i < elemen; i++) {
        // System.out.println("Hasil Dari "
        // +png[i].niai+" Pangkat "
        // +png[i].pangkat+" adalah : "
        // +png[i].pangkatDC(png[i].niai, png[i].pangkat));
        // }

    }

    static void menu(Pangkat[] png, int elemen) {
        System.out.println("=============================================================");
        System.out.println("Pilih metode perhitungan pangkat");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("=============================================================");
        int pilihan = new Scanner(System.in).nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Hasil Pangkat dengan Brute Force");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil Dari "
                            + png[i].niai + " Pangkat "
                            + png[i].pangkat + " adalah : "
                            + png[i].pangkatBF(png[i].niai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil Pangkat dengan Divide and Conquer");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil Dari "
                            + png[i].niai + " Pangkat "
                            + png[i].pangkat + " adalah : "
                            + png[i].pangkatDC(png[i].niai, png[i].pangkat));
                }
                break;
        }
    }

    static void isiElement(Pangkat[] png, int elemen, Scanner scanner) {
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat(i, i);
            System.out.print("Masukkan nilai yang akan dipangkatkan : ");
            png[i].niai = scanner.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            png[i].pangkat = scanner.nextInt();
        }
    }

}
