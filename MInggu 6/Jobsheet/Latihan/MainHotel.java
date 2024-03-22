package Jobsheet.Latihan;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();

        do {
            hotelService.tampil();
            System.out.println("1. Tambah Hotel");
            System.out.println("2. Urutkan Hotel Berdasarkan Harga Terendah");
            System.out.println("3. Urutkan Hotel Berdasarkan Bintang Terbanyak");
            System.out.print("Pilih : ");
            int pilih = hotelService.input.nextInt();
            hotelService.input.nextLine();
            switch (pilih) {
                case 1:
                    hotelService.clearScreen();
                    hotelService.addHotel();
                    break;
                case 2:
                    System.out.println("Urutkan Hotel Berdasarkan Harga Terendah");
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Selection Sort");
                    System.out.println("Pilih : ");
                    int pilihSort = hotelService.input.nextInt();
                    hotelService.input.nextLine();
                    switch (pilihSort) {
                        case 1:
                            hotelService.clearScreen();
                            System.out.println("Bubble Sort");
                            hotelService.urutkanHargaBS();
                            break;
                        case 2:
                            hotelService.clearScreen();
                            System.out.println("Selection Sort");
                            hotelService.urutkanHargaSS();
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Urutkan Hotel Berdasarkan Bintang Terbanyak");
                    System.out.println("1. Bubble Sort");
                    System.out.println("2. Selection Sort");
                    System.out.println("Pilih : ");
                    int pilihSortBintang = hotelService.input.nextInt();
                    hotelService.input.nextLine();
                    switch (pilihSortBintang) {
                        case 1:
                            hotelService.clearScreen();
                            System.out.println("Bubble Sort");
                            hotelService.urutkanBintangBS();
                            break;
                        case 2:
                            hotelService.clearScreen();
                            System.out.println("Selection Sort");
                            hotelService.urutkanBintangSS();
                            break;
                        default:
                            System.out.println("Pilihan tidak ada");
                            break;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        } while (true);
        }

    }

