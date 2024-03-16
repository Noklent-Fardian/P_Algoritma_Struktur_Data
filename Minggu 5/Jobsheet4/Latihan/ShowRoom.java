package Jobsheet4.Latihan;

import java.lang.reflect.Array;

public class ShowRoom {
    public String merk, tipe;
    public int tahun, top_Acceleration, top_powers;

    public ShowRoom(String merk, String tipe, int tahun, int top_Acceleration, int top_powers) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_Acceleration = top_Acceleration;
        this.top_powers = top_powers;
    }

    public ShowRoom() {
    }

    public void tampil(ShowRoom[] Sr) {
        String firstLine = "╔═══════════════════════╦═════════════╦══════════╦══════════════════╦══════════════════╗";
        String middleLine = "╠═══════════════════════╬═════════════╬══════════╬══════════════════╬══════════════════╣";
        String lastLine = "╚═══════════════════════╩═════════════╩══════════╩══════════════════╩══════════════════╝";
        String formatTable = "║ %-21s ║  %-10s ║  %-7s ║ %-17s║ %-17s║%n";
        System.out.println(firstLine);
        System.out
                .println("║ Merk                  ║ Tipe        ║  Tahun   ║ Top_Acceletaion  ║ Top_Power        ║");
        System.out.println(middleLine);
        for (int i = 0; i < Sr.length; i++) {
            System.out.printf(formatTable, Sr[i].tipe, Sr[i].merk, Sr[i].tahun, Sr[i].top_Acceleration,
                    Sr[i].top_powers);
            if (i < Sr.length - 1) {
                System.out.println(middleLine);
            }
        }

        System.out.println(lastLine);
        return;
    }

    // Mencari min max dengan divide conquer
    public void topAccelTertinggi(ShowRoom[] Sr, int l, int r) {
        int maxl = Sr[l].top_Acceleration;
        int maxr = Sr[r].top_Acceleration;
        int mid = (0 + Sr.length) / 2;
        if (maxl == maxr) {
            System.out.println(Sr[l].merk + " " + Sr[l].tipe);
        }else if (maxl > maxr && maxl > Sr[mid].top_Acceleration) {
            topAccelTertinggi(Sr, l, r - 1);
        } else {
            topAccelTertinggi(Sr, l + 1, r);

        }
    }

    public void topAccelTerendah(ShowRoom[] Sr, int l, int r) {
        int minl = Sr[l].top_Acceleration;
        int minr = Sr[r].top_Acceleration;
        int mid = (0 + Sr.length) / 2;
        if (minl == minr) {
            System.out.println(Sr[l].merk + " " + Sr[l].tipe);
        }else if (minl < minr && minl < Sr[mid].top_Acceleration) {
            topAccelTerendah(Sr, l, r - 1);
        } else {
            topAccelTerendah(Sr, l + 1, r);

        }
    }

    public double rataRata(ShowRoom[] Sr) {
        double total = 0;
        for (int i = 0; i < Sr.length; i++) {
            total += Sr[i].top_powers;
        }
        return total / Sr.length;
    }
}
