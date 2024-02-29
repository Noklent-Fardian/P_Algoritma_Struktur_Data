package Joobshet3.ArrayBalok;

public class MainArrayBalok {
    public static void main(String[] args) {
        Balok[] blArray = new Balok[3];
        blArray[0] = new Balok(100, 30, 12);
        blArray[1] = new Balok(120, 40, 15);
        blArray[2] = new Balok(210, 50, 25);

        
        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Balok ke-" + (i + 1) + ", panjang: " + blArray[i].panjang + ", lebar: "
                    + blArray[i].lebar + ", tinggi: " + blArray[i].tinggi);
            System.out.println("Volume Balok ke-" + (i + 1) + ": " + blArray[i].hitungVolume());
        }
    }
}
