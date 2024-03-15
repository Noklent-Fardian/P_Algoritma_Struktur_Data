package Jobsheet4.Percobaan3;

import java.util.Scanner;

/**
 * MainSum
 */
public class MainSum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("=============================================================");
        System.out.print("Masukan jumlah bulan : ");
        int elm = sc.nextInt();
        Sum sm = new Sum(elm);
        System.out.println("========================");
        for (int i = 0; i < sm.element; i++) {
            System.out.print("Masukan untung bulan ke- " + (i+1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("========================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahan selama " + sm.element + " bulan adalah = " + sm.totalBf(sm.keuntungan));
        System.out.println("=============================");
        System.out.println("Algoritma Divide Conquer");
        System.out.println("Total keuntungan perusahan selama " + sm.element + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.element-1));

    }
}