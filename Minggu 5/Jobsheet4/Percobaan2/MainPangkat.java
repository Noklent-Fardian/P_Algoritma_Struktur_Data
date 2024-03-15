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
        // for (int i = 0; i < elemen; i++) {
        //     png[i] = new Pangkat(i,i);
        //     System.out.print("Masukkan nilai yang akan dipangkatkan : ");
        //     png[i].niai = scanner.nextInt();
        //     System.out.print("Masukkan nilai pemangkat : ");
        //     png[i].pangkat = scanner.nextInt();
        // }
        System.out.println("=============================================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil Dari "
            +png[i].niai+" Pangkat "
            +png[i].pangkat+" adalah : "
            +png[i].pangkatBF(png[i].niai, png[i].pangkat));
        }
        System.out.println("=============================================================");
        System.out.println("Hasil Pangkat dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil Dari "
            +png[i].niai+" Pangkat "
            +png[i].pangkat+" adalah : "
            +png[i].pangkatDC(png[i].niai, png[i].pangkat));
        }
        
    }
    static void isiElement(Pangkat[] png, int elemen, Scanner scanner) {
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat(i,i);
            System.out.print("Masukkan nilai yang akan dipangkatkan : ");
            png[i].niai = scanner.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            png[i].pangkat = scanner.nextInt();
        }
    }

}
