package Joobshet3.Latihan2;

public class Hitung {
    //Deklarasi variabel
    String nama;
    String nim;
    double nilai;
    String kelamin;

    //Konstruktor
    public Hitung(String nama, String nim, double nilai, String kelamin){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        this.kelamin = kelamin;
    }
    public Hitung(){
        
    }
    //logic
    public  void cetak(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + nilai);
        System.out.println("Jenis Kelamin : " + kelamin);
    }

    public void hitungRangking(Hitung[] hitung){
        for (int i = 0; i < hitung.length; i++) {
            for (int j = 0; j < hitung.length; j++) {
                if (hitung[i].nilai > hitung[j].nilai) {
                    Hitung temp = hitung[i];
                    hitung[i] = hitung[j];
                    hitung[j] = temp;
                }
            }
        }
    }
    public void ratarata(Hitung[] hitung){
        double total = 0;
        for (int i = 0; i < hitung.length; i++) {
            total += hitung[i].nilai;
        }
        double rata = total / hitung.length;
        System.out.println("Rata-rata IPK : " + rata);
    }

    
}
