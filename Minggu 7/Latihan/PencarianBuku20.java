package Latihan;
public class PencarianBuku20 {
    Buku20 listBk[] = new Buku20[5];
    
    int idx;
    PencarianBuku20(){
        listBk[4] = new Buku20("20218e", "Dasar Pemrograman Java", "Abdul Kadir", 2004, 200);
        listBk[3] = new Buku20("20216d", "Pemrograman Java", "Indrajani", 2005, 100);
        listBk[2] = new Buku20("20215c", "Algoritma", "Indrajani", 2019, 100);
        listBk[1] = new Buku20("20211b", "Pemrograman Berbasis Objek", "Indrajani", 2005, 100);
        listBk[0] = new Buku20("20210a", "Dasar Pemrograman", "Abdul Kadir", 2004, 200);
    }

    // Array listBk
    // fungsi tambah
    void tambah(Buku20 bk){
        if(idx < listBk.length){
            listBk[idx] = bk;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }
    //fungsi tampi
    void tampil(){
        for(Buku20 bk : listBk){
            bk.tampil();
        }
    }

    //method findseqsearch
    public int FindSeqSearch(String cari){
        System.out.println("Mencari Buku Dengan Sequential Search");
        int posisi = -1;
        for(int j=0; j<listBk.length; j++){
            if(listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    //tamplkan posisi
    public void TampilPosisi(String x, int pos){
        if(pos != -1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
            listBk[pos].tampil();
        }else{
            System.out.println("data : " + x + " tidak ditemukan");
        }
    }
    //method findbuku
    public Buku20 FindBuku(String cari) {
        for (Buku20 buku : listBk) {
            if (buku.kodeBuku.equals(cari)) {
                return buku;
            }
        }
        return null;
    }
    //method findbinarysearch
    public int FindBinarySearch(String cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(listBk[mid].kodeBuku.equals(cari)){
                return (mid);
            }else if(listBk[mid].kodeBuku.compareTo(cari) > 0){
                System.out.println(listBk[mid].kodeBuku.compareTo(cari));
                return FindBinarySearch(cari, left, mid-1);
            }else{System.out.println(listBk[mid].kodeBuku.compareTo(cari));
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
}
