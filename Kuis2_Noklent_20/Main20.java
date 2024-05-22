import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Restoran20 restoran20 = new Restoran20();
        restoran20.addLastPembeli20(1, "Mamluatul", "0822450000");
        restoran20.addLastPembeli20(2, "Abyas A.M", "0822451111");
        restoran20.addLastPembeli20(3, "Yoshinoya", "0822452222");

        boolean isRun20 = true;
        Scanner Noklent20 = new Scanner(System.in);

        System.out.println("=========== Quizz 2 PRAKTIKUM ASD ===========");
        System.out.println("Dibuat oleh : Noklent Fardian Erix ");
        System.out.println("NIM         : 2341720082 ");
        System.out.println("Absen       : 20 ");

        do {
            System.out.println("=============================================");
            System.out.println("Sistem Antrian Restoran");
            System.out.println("=============================================");
            System.out.println("Menu : ");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by Nama Terkecil ke Terbesar");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("=============================================");
            System.out.print("Masukkan Pilihan (1-6): ");
            int pilihan20 = Noklent20.nextInt();
            System.out.println("=============================================");

            switch (pilihan20) {
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Masukan Data Pembeli");
                    System.out.println("---------------------------------------------");
                    System.out.println("No Antrian : " + (Restoran20.total_antrian20 + 1));
                    int noAntrian20 = Restoran20.total_antrian20 + 1;
                    System.out.print("Nama Pembeli : ");
                    String namaPembeli20;
                    Noklent20.nextLine();
                    namaPembeli20= Noklent20.nextLine();
                    System.out.print("No HP : ");
                    String noHp20;
                    noHp20= Noklent20.next();
                    System.out.println("---------------------------------------------");
                    restoran20.addLastPembeli20(noAntrian20, namaPembeli20, noHp20);
                    System.out.println("Data Berhasil Ditambahkan");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Daftar Antrian Masuk Restoran Noklent20");
                    System.out.println("---------------------------------------------");
                    restoran20.cetakAntrian20();
                    break;
                case 3:
                    restoran20.hapusAntrian20();
                    break;
                case 4:
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Pesanan Restoran Noklent20");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    restoran20.sortPesanan20();
                    break;
                    case 5:
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Total Pendapatan Restoran Noklent20");
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
                    restoran20.totalPendapatan20();
                    break;
                case 6:
                    isRun20 = false;
                    break;
                default:
                    break;
            }
        } while (isRun20);
        System.out.println("Terima Kasih");
    }

}
