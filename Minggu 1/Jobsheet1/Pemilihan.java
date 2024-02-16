package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kuis, uts, uas, tugas;
        double NilaiAkhir;
        String grade;
        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("========================================="
                + "=====================");
        System.out.print("Masukan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukan Nilai Kuis : ");
        kuis = input.nextInt();
        System.out.print("Masukan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextInt();
        NilaiAkhir = (0.20 * tugas) +(0.20 * kuis) + (0.30 * uts) + (0.30 * uas);
        System.out.println("Nilai Akhir : " + NilaiAkhir);
        if (NilaiAkhir >= 85) {
            grade = "A";
        } else if (NilaiAkhir >= 75) {
            grade = "B";
        } else if (NilaiAkhir >= 65) {
            grade = "C";
        } else if (NilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Grade : " + grade);


    }

}
