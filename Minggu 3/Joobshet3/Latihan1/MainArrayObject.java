package Joobshet3.Latihan1;

import java.util.Scanner;

public class MainArrayObject {
    public static void main(String[] args) {
        int r, s, tl, sl, rb;
        BangunRuang[] bangunRuang = new BangunRuang[3];
        for (int i = 0; i < bangunRuang.length; i++) {
            if (i == 0) {
                System.out.println("================================ KERUCUT =================================");
                r = Integer.parseInt(input("Masukkan jari-jari kerucut: "));
                s = Integer.parseInt(input("Masukkan sisi miring kerucut: "));
                Kerucut kerucut = new Kerucut(r, s);
                System.out.println("HASIL: ");
                System.out.println("Luas Permukaan Kerucut: " + kerucut.hitungLuas(r, s));
                System.out.println("Volume Kerucut: " + kerucut.hitungVolume(r, s));
            } else if (i == 1) {
                System.out
                        .println("================================ LIMAS SEGI EMPAT =================================");
                tl = Integer.parseInt(input("Masukkan tinggi limas segiempat: "));
                sl = Integer.parseInt(input("Masukkan sisi limas segiempat: "));
                LimasSegiEmpatSamaSisi limasSegiEmpatSamaSisi = new LimasSegiEmpatSamaSisi(tl, sl);
                System.out.println("HASIL: ");
                System.out.println("Luas Permukaan Limas Segi Empat: " + limasSegiEmpatSamaSisi.hitungLuasPermukaan( sl));
                System.out.println("Volume Limas Segi Empat: " + limasSegiEmpatSamaSisi.hitungVolume(tl, sl));
            } else {
                System.out.println("================================ BOLA =================================");
                rb = Integer.parseInt(input("Masukkan Jari Jari Bola: "));
                Bola bola = new Bola(rb);
                System.out.println("HASIL: ");
                System.out.println("Luas Permukaan Bola: " + bola.hitungLuas(rb));
                System.out.println("Volume Bola: " + bola.hitungVolume(rb));
            }
        }
    }

    private static String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
