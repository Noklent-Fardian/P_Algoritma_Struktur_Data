package Jobsheet.Latihan;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class HotelService {
    Scanner input = new Scanner(System.in);
    Hotel[] room = new Hotel[5];
    // add data hotel
   public HotelService() {
        room[0] = new Hotel("Hotel A", "Jakarta", 1000000, (byte) 5);
        room[1] = new Hotel("Hotel B", "Bandung", 500000, (byte) 2);
        room[2] = new Hotel("Hotel C", "Bali", 2000000, (byte) 5);
        room[3] = new Hotel("Hotel D", "Surabaya", 300000, (byte) 3);
        room[4] = new Hotel("Hotel E", "Yogyakarta", 400000, (byte) 4);
    }
    // add data hotel
    public void addHotel() {
        System.out.print("Masukan Nama Hotel : ");
        String nama = input.nextLine();
        System.out.print("Masukan Kota : ");
        String kota = input.nextLine();
        System.out.print("Masukan Harga : ");
        int harga = input.nextInt();
        System.out.print("Masukan Bintang 1-5: ");
        byte bintang = input.nextByte();
        room = Arrays.copyOf(room, room.length+1);
        for (int i = 0; i < room.length; i++) {
            if (room[i] == null) {
                room[i] = new Hotel(nama, kota, harga, bintang);
                break;
            }else if(i == room.length-1){
                System.out.println("Room Penuh");
            }
        }
    }
    // tampil hotel
    void tampil() {
        String firstLine = "╔════╦═════════════════╦════════════╦════════════╦═════════╗";
        String middleLine = "╠════╬═════════════════╬════════════╬════════════╬═════════╣";
        String lastLine = "╚════╩═════════════════╩════════════╩════════════╩═════════╝";
        String formatTable = "║ %2d ║ %-15s ║ %-10s ║ %10s ║ %-7s ║%n";
        System.out.println(firstLine);
        System.out
                .println("║ NO ║ NAMA HOTEL      ║ KOTA       ║ HARGA(Rp)  ║ BINTANG ║");
        for (int i = 0; i < room.length; i++) {
            System.out.println(middleLine);
            if (room[i] != null) {
                System.out.printf(formatTable, i + 1, room[i].nama,
                        room[i].kota, room[i].harga, room[i].bintang);
            }

        }
        System.out.println(lastLine);

    }
    // urutkan hotel berdasarkan harga terendah dengan bubble sort
    public void urutkanHargaBS() {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room.length - 1; j++) {
                if (room[j] != null && room[j + 1] != null) {
                    if (room[j].harga > room[j + 1].harga) {
                        Hotel temp = room[j];
                        room[j] = room[j + 1];
                        room[j + 1] = temp;
                    }
                }
            }
        }
    }
    // urutkan hotel berdasarkan harga terendah dengam selection sort
    public void urutkanBintangSS() {
        for (int i = 0; i < room.length; i++) {
            int min = i;
            for (int j = i + 1; j < room.length; j++) {
                if (room[j] != null && room[min] != null) {
                    if (room[j].harga < room[min].harga) {
                        min = j;
                    }
                }
            }
            if (room[min] != null && room[i] != null) {
                Hotel temp = room[min];
                room[min] = room[i];
                room[i] = temp;
            }
        }
    }
    // urutkan hotel berdasarkan bintang terbanyak dengan bubble sort
    public void urutkanBintangBS() {
        for (int i = 0; i < room.length; i++) {
            for (int j = 0; j < room.length - 1; j++) {
                if (room[j] != null && room[j + 1] != null) {
                    if (room[j].bintang < room[j + 1].bintang) {
                        Hotel temp = room[j];
                        room[j] = room[j + 1];
                        room[j + 1] = temp;
                    }
                }
            }
        }
    }
    // urutkan hotel berdasarkan bintang terbanyak dengan selection sort
    public void urutkanHargaSS() {
        for (int i = 0; i < room.length; i++) {
            int min = i;
            for (int j = i + 1; j < room.length; j++) {
                if (room[j] != null && room[min] != null) {
                    if (room[j].bintang > room[min].bintang) {
                        min = j;
                    }
                }
            }
            if (room[min] != null && room[i] != null) {
                Hotel temp = room[min];
                room[min] = room[i];
                room[i] = temp;
            }
        }
    }

    //clear screen
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
