import java.util.Scanner;

public class Restoran20 {
    Pembeli20 dataPembeli20;
    Pesanan20 dataPesanan20;
    Node20 headPembeli20, nodePembeli20;
    Node20 headPesanan20, nodePesanan20;
    int totalPendapatan20;
    public static int size20,total_antrian20;

    public Restoran20() {
        headPembeli20 = null;
        nodePembeli20 = null;
        headPesanan20 = null;
        nodePesanan20 = null;
        size20 = 0;
        total_antrian20 = 0;
    }

    public boolean isEmpty() {
        return headPembeli20 == null;
    }

    public boolean isEmptyPesanan() {
        return headPesanan20 == null;
    }

    // add pembeli
    public void addLastPembeli20(int a20, String b20, String c20) {
        Pembeli20 newPembeli20 = new Pembeli20(a20, b20, c20);
        Node20 newNode20 = new Node20(null, newPembeli20, null);
        if (isEmpty()) {
            headPembeli20 = newNode20;
            nodePembeli20 = newNode20;
        } else {
            nodePembeli20.next20 = newNode20;
            newNode20.prev20 = nodePembeli20;
            nodePembeli20 = newNode20;
        }
        total_antrian20++;
        size20++;
    }

    public void cetakAntrian20() {
        Node20 current20 = headPembeli20;
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("| No Antrian\t| Nama Pembeli\t\t | No HP      |");
            while (current20 != null) {
                System.out.println("| " + current20.dataPembeli20.NoAntrian20 + "\t\t| "
                        + current20.dataPembeli20.namaPembeli20 + "\t\t | " + current20.dataPembeli20.noHp20 + " |");
                current20 = current20.next20;
            }
            System.out.println("Total Antrian : " + size20);
        }
    }

    public void hapusAntrian20() {
        boolean inginTambah20 = true;
        Scanner Noklent20 = new Scanner(System.in);
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
           do{
            System.out.println(headPembeli20.dataPembeli20.namaPembeli20 + " Telah Memesan Menu");
            System.out.println("---------------------------------------------");
            System.out.println("Transaksi Input Pesanan");
            System.out.println("---------------------------------------------");
            System.out.println("Nomo Antrian   : " + headPembeli20.dataPembeli20.NoAntrian20);
            System.out.print("Pesan Menu     : ");
            String namaPesanan20 = Noklent20.nextLine();
            System.out.print("Jumlah Pesanan : ");
            int jumlahPesanan20 = Noklent20.nextInt();
            System.out.print("Harga          : ");
            int harga20 = Noklent20.nextInt();
            System.out.println("Total Harga    : " + jumlahPesanan20 * harga20);
            System.out.println("---------------------------------------------");
            Pesanan20 newPesanan20 = new Pesanan20(headPembeli20.dataPembeli20.NoAntrian20, namaPesanan20, jumlahPesanan20, harga20);
            totalPendapatan20 += newPesanan20.total20;
            Node20 newNode20 = new Node20(null, newPesanan20, null);
            if (isEmptyPesanan()) {
                headPesanan20 = newNode20;
                nodePesanan20 = newNode20;
            } else {
                nodePesanan20.next20 = newNode20;
                newNode20.prev20 = nodePesanan20;
                nodePesanan20 = newNode20;
            }
            System.out.print("Tambah Pesanan Lagi ? (Y/T) : ");
            String Pilihantambah20 = Noklent20.next();
            if(Pilihantambah20.equalsIgnoreCase("t")){
                inginTambah20 = false;
            }
            Noklent20.nextLine();
           }while(inginTambah20);
            headPembeli20 = headPembeli20.next20;
            size20--;
        }
    }
    //sort node pesanan by nama
    public void sortPesanan20() {
        Node20 current20 = headPesanan20;
        Node20 index20 = null;
        if (isEmptyPesanan()) {
            System.out.println("Pesanan Kosong");
        } else {
            while (current20 != null) {
                index20 = current20.next20;
                while (index20 != null) {
                    if (current20.dataPesanan20.namaPesanan20.compareTo(index20.dataPesanan20.namaPesanan20) > 0) {
                        int tempKode20 = current20.dataPesanan20.kodePesanan20;
                        current20.dataPesanan20.kodePesanan20 = index20.dataPesanan20.kodePesanan20;
                        index20.dataPesanan20.kodePesanan20 = tempKode20;

                        String tempNama20 = current20.dataPesanan20.namaPesanan20;
                        current20.dataPesanan20.namaPesanan20 = index20.dataPesanan20.namaPesanan20;
                        index20.dataPesanan20.namaPesanan20 = tempNama20;

                        int tempJumlah20 = current20.dataPesanan20.jumlahPesanan20;
                        current20.dataPesanan20.jumlahPesanan20 = index20.dataPesanan20.jumlahPesanan20;
                        index20.dataPesanan20.jumlahPesanan20 = tempJumlah20;

                        int tempHarga20 = current20.dataPesanan20.Harga20;
                        current20.dataPesanan20.Harga20 = index20.dataPesanan20.Harga20;
                        index20.dataPesanan20.Harga20 = tempHarga20;

                        int tempTotal20 = current20.dataPesanan20.total20;
                        current20.dataPesanan20.total20 = index20.dataPesanan20.total20;
                        index20.dataPesanan20.total20 = tempTotal20;
                    }
                    index20 = index20.next20;
                }
                current20 = current20.next20;
            }
            showPesanan20();
        }
    }

    public void showPesanan20() {
        Node20 current20 = headPesanan20;
        if (isEmptyPesanan()) {
            System.out.println("Pesanan Kosong");
        } else {
            System.out.println("| Kode Pesanan\t| Nama Pesanan\t\t | Jumlah | Harga         | Total Harga |");
            while (current20 != null) {
                System.out.println("| " + current20.dataPesanan20.kodePesanan20 + "\t\t| "
                        + current20.dataPesanan20.namaPesanan20 + "\t\t | " + current20.dataPesanan20.jumlahPesanan20
                        + "     | " + current20.dataPesanan20.Harga20 + "            | " + current20.dataPesanan20.total20 + " |");
                current20 = current20.next20;
            }
        }
    }


    public void totalPendapatan20() {
        System.out.println("Total Pendapatan Restoran Noklent20 : " + totalPendapatan20);
    }

}

