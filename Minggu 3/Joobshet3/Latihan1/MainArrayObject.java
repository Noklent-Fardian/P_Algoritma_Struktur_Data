package Joobshet3.Latihan1;

import java.util.Scanner;

public class MainArrayObject {
    public static void main(String[] args) {

        Kerucut[] kArray;
        Bola[] bArray;
        LimasSegiEmpatSamaSisi[] lArray;

        System.out.println("========= Menghitung Volume dan Luas Permukaan Bangun Ruang ===========");
        int jumlah = Integer.parseInt(input("Jumlah bangun ruang : "));

        kArray = new Kerucut[jumlah];
        bArray = new Bola[jumlah];
        lArray = new LimasSegiEmpatSamaSisi[jumlah];
        // Input
        System.out.println("Inputkan Data Kerucut");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Kerucut ke-" + (i + 1));
            int r = Integer.parseInt(input("Jari-jari: "));
            int s = Integer.parseInt(input("Tinggi: "));
            kArray[i] = new Kerucut(r, s);
        }
        System.out.println("Inputkan Data Lima Segi Empat Sama Sisi");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Limas Segi Empat Sama Sisi ke-" + (i + 1));
            int t = Integer.parseInt(input("Tinggi: "));
            int s = Integer.parseInt(input("Sisi: "));
            lArray[i] = new LimasSegiEmpatSamaSisi(t, s);
        }
        System.out.println("Inputkan Data Bola");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Bola ke-" + (i + 1));
            int r = Integer.parseInt(input("Jari-jari: "));
            bArray[i] = new Bola(r);
        }

        // Print Hasil
        System.out.println("============ HASIL PERHITUNGAN ===========");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Kerucut ke-" + (i + 1) + ", Jari Jari: " + kArray[i].r + ", Tinggi: " + kArray[i].s);
            System.out.printf("Volume Kerucut ke-" + (i + 1) + ": %.2f\n",
                    kArray[i].hitungVolume(kArray[i].r, kArray[i].s));
            System.out.printf("Luas Permukaan Kerucut ke-" + (i + 1) + ":%.2f\n",
                    kArray[i].hitungLuas(kArray[i].r, kArray[i].s));

        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println(
                    "Limas Segi Empat Sama Sisi ke-" + (i + 1) + ", Tinggi: " + lArray[i].t + ", Sisi: " + lArray[i].s);
            System.out.printf("Volume Limas Segi Empat Sama Sisi ke-" + (i + 1) + ": %.2f\n",
                    lArray[i].hitungVolume(lArray[i].t, lArray[i].s));
            System.out.printf("Luas Permukaan Limas Segi Empat Sama Sisi ke-" + (i + 1) + ":%.2f\n",
                    lArray[i].hitungLuasPermukaan(lArray[i].s));
        }
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Bola ke-" + (i + 1) + ", Jari Jari: " + bArray[i].r);
            System.out.printf("Volume Bola ke-" + (i + 1) + ": %.2f\n", bArray[i].hitungVolume(bArray[i].r));
            System.out.printf("Luas Permukaan Bola ke-" + (i + 1) + ":%.2f\n", bArray[i].hitungLuas(bArray[i].r));
        }

    }

    private static String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
