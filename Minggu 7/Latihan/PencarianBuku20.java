package Latihan;

public class PencarianBuku20 {
    Buku20 listBk[] = new Buku20[6];

    int idx;

    PencarianBuku20() {
        listBk[4] = new Buku20("20213c", "Dasar Pemrograman", "Abdul Kadir", 2004, 200);
        listBk[3] = new Buku20("20216d", "Pemrograman Java", "Indrajani", 2005, 100);
        listBk[2] = new Buku20("20215a", "Algoritma", "Indrajani", 2019, 100);
        listBk[5] = new Buku20("20224bb", "Pemrograman Berbasis Objek", "Bukan Indrajati", 2005, 100);
        listBk[1] = new Buku20("20223b", "Pemrograman Berbasis Objek", "Indrajani", 2005, 100);
        listBk[0] = new Buku20("20212c", "Dasar Pemrograman", "Bukan Abdul", 2004, 200);
    }

    // Array listBk
    // fungsi tambah
    void tambah(Buku20 bk) {
        if (idx < listBk.length) {
            listBk[idx] = bk;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    // fungsi tampi
    void tampil() {
        for (Buku20 bk : listBk) {
            bk.tampil();
        }
    }

    // method findseqsearch
    public int FindSeqSearch(String cari) {
        System.out.println("Mencari Buku Dengan Sequential Search");
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // method findseqsearchbyjudul
    public int FindSeqSearchByJudul(String cari) {
        System.out.println("Mencari Buku Dengan Sequential Search");
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].judulBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    // tamplkan posisi
    public void TampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
            listBk[pos].tampil();
        } else {
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }

    // method findbuku
    public Buku20 FindBuku(String cari) {
        for (Buku20 buku : listBk) {
            if (buku.kodeBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }  

    // method findbinarysearch
    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listBk[mid].kodeBuku.equals(cari)) {
                return (mid);
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // method findbinarysearchbyjudul
    public int FindBinarySearchByJudul(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (listBk[mid].judulBuku.equals(cari)) {
                return (mid);
            } else if (listBk[mid].judulBuku.compareTo(cari) > 0) {
                return FindBinarySearchByJudul(cari, left, mid - 1);
            } else {
                return FindBinarySearchByJudul(cari, mid + 1, right);
            }
        }
        return -1;
    }

    // sorting dengan kode buku
    public void BubbleSort() {
        clear();
        System.out.println("Telah diurutkan berdasarkan kode buku");
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (listBk[j].kodeBuku.compareTo(listBk[j - 1].kodeBuku) < 0) {
                    Buku20 tmp = listBk[j];
                    listBk[j] = listBk[j - 1];
                    listBk[j - 1] = tmp;
                }
            }
        }
    }

    // sorting dengan judul buku
    public void SelectionSort() {int counter = 0;
        clear();
        System.out.println("Telah diurutkan berdasarkan judul buku");
        for (int i = 0; i < listBk.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listBk.length; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[idxMin].judulBuku) == 0) {
                    counter++;
                }
                if (listBk[j].judulBuku.compareTo(listBk[idxMin].judulBuku) < 0) {
                    idxMin = j;
                }
                if (counter > 0) {
                    System.out.println(" Terdapat Judul Buku yang sama  yaitu " + " ' "
                            + listBk[j].judulBuku + " ' " + " dengan kode buku " + listBk[j].kodeBuku
                            + " dan  dengan kode buku " + listBk[idxMin].kodeBuku);
                            counter=0;
                            
    
                }
            }
            Buku20 tmp = listBk[idxMin];
            listBk[idxMin] = listBk[i];
            listBk[i] = tmp;
        }
    }

    // clear screen
    public void clear() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
