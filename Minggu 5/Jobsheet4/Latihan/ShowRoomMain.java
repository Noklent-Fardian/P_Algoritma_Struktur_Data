package Jobsheet4.Latihan;

import java.util.Scanner;

public class ShowRoomMain {
    public static void main(String[] args) {
        boolean isTrue = true;
        ShowRoom[] sr = new ShowRoom[8];
        sr[0] = new ShowRoom("BMW", "M2 Coupe", 2016, 6816, 728);
        sr[1] = new ShowRoom("FORD", "Fiesta ST", 2014, 3921, 575);
        sr[2] = new ShowRoom("NiSSAN", "370Z", 2009, 4360, 657);
        sr[3] = new ShowRoom("SUBARU", "BRZ", 2014, 4058, 609);
        sr[4] = new ShowRoom("SUBARU", "Impreza WRX STI", 2013, 6255, 703);
        sr[5] = new ShowRoom("TOYOTA", "AE86 Trueno", 1986, 3700, 553);
        sr[6] = new ShowRoom("TOYOTA", "86/GT86 ", 2014, 4180, 609);
        sr[7] = new ShowRoom("VOLKSWAGEN", "Golf GTI", 2014, 4180, 631);
        ShowRoom s = new ShowRoom();
        s.tampil(sr);

        do {
            System.out.println("Pilihan : ");
            System.out.println("1. Top Acceleration Tertinggi Dengan Divide Conquer");
            System.out.println("2. Top Accelerattion Terendh dengan Divide Conquer");
            System.out.println("3. Rata-rata Top Power dengan Brute Force");
            Scanner Scan = new Scanner(System.in);

            int pilihan = Scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Merk Mobil dengan Top Acceleration Tertinggi : ");
                    s.topAccelTertinggi(sr, 0, sr.length - 1);
                    break;
                case 2:
                    System.out.println("Merk Mobil dengan Top Acceleration Terendah : ");
                    s.topAccelTerendah(sr, 0, sr.length - 1);
                    break;
                case 3:
                    System.out.println("Rata-rata Top Power : " + s.rataRata(sr));
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (isTrue);
    }

}