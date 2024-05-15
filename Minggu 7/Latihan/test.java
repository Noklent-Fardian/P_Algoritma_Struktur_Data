 package Latihan;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        int angka;
        System.out.println("Mengubah bilangan desimal ke biner");
        System.out.print("Masukkan bilangan desimal : ");
        angka = 23;
        biner(angka);
    }

    //mencari biner dengan desimal 
    public static void biner(int angka) {
        int sisa;
        if (angka <= 1) {
            System.out.print(angka);
            return;
        }
        System.out.print(angka +"/"+2 +"=");
        sisa = angka % 2;
        System.out.println(sisa);
        biner(angka / 2);
        System.out.print(sisa);
    }
}