package Joobshet3;

import java.util.Scanner;

public class ArrayObjects {
    public static void main(String[] args) {
        /*
        //  * PersegiPanjang[] ppArray = new PersegiPanjang[3];
        //  * 
        //  * ppArray[0] = new PersegiPanjang();
        //  * ppArray[0].panjang = 110;
        //  * ppArray[0].lebar = 30;
        //  * 
        //  * ppArray[1] = new PersegiPanjang();
        //  * ppArray[1].panjang = 80;
        //  * ppArray[1].lebar = 40;
        //  * 
        //  * ppArray[2] = new PersegiPanjang();
        //  * ppArray[2].panjang = 100;
        //  * ppArray[2].lebar = 20;
        //  * 
        //  * System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang +
        //  * ", lebar: " + ppArray[0].lebar);
        //  * System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang +
        //  * ", lebar: " + ppArray[1].lebar);
        //  * System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang +
        //  * ", lebar: " + ppArray[2].lebar);
        //  * 
         * ---------Perobaan 1--------------
         */

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Persegi :");
        int jumlah = input.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlah];
        for (int i = 0; i < ppArray.length; i++) {
            // ppArray[0] = new PersegiPanjang();
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-" + (i+1));
            System.out.print("Masukan Panjang: ");
            ppArray[i].panjang = input.nextInt();
            System.out.print("Masukan Lebar: ");
            ppArray[i].lebar = input.nextInt();

        }
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + (i+1) + ", panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

    }

}
