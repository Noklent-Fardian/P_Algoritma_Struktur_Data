package Jobsheet4;

import java.util.Scanner;

public class MainFaktorial20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.print("Masuka Jumlah Element");
        int iJml = sc.nextInt();

        faktorial20[] fk = new faktorial20[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new faktorial20();
            System.out.println("Masukan nilai element ke-" + (i + 1));
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("====================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Penghitungan Faktorial Menggunakan Brute Force Adalah =" + fk[i].faktorialBF20(fk[i].nilai));
        }
        System.out.println("====================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil Penghitungan Faktorial Menggunakan Divide and Conquer Adalah =" + fk[i].faktorialDC20(fk[i].nilai));
        }

    }
}
