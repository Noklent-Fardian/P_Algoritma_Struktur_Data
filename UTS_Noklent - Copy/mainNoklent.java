import java.util.Scanner;

public class mainNoklent {
    public static void main(String[] args) {
        Scanner inputNoklent = new Scanner(System.in);
        int jumlahNoklent=0;
        boolean isSixNoklent = true;
        controllerNoklent cNoklent = new controllerNoklent();

        System.out.println("===================================");
        System.out.println("  Selamat Datang Di Kelas Noklent");
        System.out.println("===================================");
        while (isSixNoklent) {
            System.out.print("Masukan Jumlah Siswa. Minimal 6 : ");
            jumlahNoklent = inputNoklent.nextInt();
            if (jumlahNoklent<6) {
                System.out.println("Masukan Jumlah SIswa yang Benar!!");
            }
            else
            isSixNoklent=false;
        }
        cNoklent.arrNoklent = new siswaNoklent[jumlahNoklent];
        for (int i = 0; i < jumlahNoklent; i++) {
            System.out.println("Siswa ke-" + (i + 1));
            System.out.print("Masukkan NISN: ");
            String nisnNoklent = inputNoklent.next();
            System.out.print("Masukkan Nama: ");
            String namaNoklent = inputNoklent.next();
            System.out.print("Masukkan Alamat: ");
            String alamatNoklent = inputNoklent.next();
            System.out.print("Masukkan Tahun Masuk: ");
            int tahunNoklent = inputNoklent.nextInt();
            System.out.print("Masukkan Nilai: ");
            double nilaiNoklent = inputNoklent.nextDouble();
            cNoklent.arrNoklent[i] = new siswaNoklent(nisnNoklent, namaNoklent, alamatNoklent, tahunNoklent,
                    nilaiNoklent);
        }
        cNoklent.showDataNoklent();

        while (true) {
            System.out.println("Silakan Pilih Menu:");
            System.out.println("1. Pencarian berdasarkan NISN");
            System.out.println("2. Urutan Data Berdasarkan Nilai Tertingggi");
            System.out.println("3. Tampilkan Siswa");
            System.out.println("4.Keluar");
            System.out.println(" ");
            System.out.print("Pilihan : ");
            int pilihanNoklent = inputNoklent.nextInt();
            switch (pilihanNoklent) {
                case 1:
                cNoklent.sortNisnNoklent();
                    cNoklent.showDataNoklent();
                    System.out.print("Masukkan NISN: ");
                    String nisnNoklent = inputNoklent.next();
                    cNoklent.searchNisnNoklent(nisnNoklent);
                    break;
                case 2:
                    cNoklent.sortNilaiNoklent();
                    break;
                case 3:
                    cNoklent.showDataNoklent();
                    break;
                case 4:
                System.out.println("Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }
}
