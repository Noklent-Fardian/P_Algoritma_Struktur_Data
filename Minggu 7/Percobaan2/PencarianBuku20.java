package Percobaan2;
public class PencarianBuku20 {
    Buku20 listBk[] = new Buku20[5];
    
    int idx;
    PencarianBuku20(){
        listBk[0] = new Buku20(111, "Algoritma", "Indrajani", 2019, 100);
        listBk[1] = new Buku20(132, "Dasar Pemrograman Java", "Abdul Kadir", 2004, 200);
        listBk[2] = new Buku20(121, "Pemrograman Java", "Indrajani", 2005, 100);
        listBk[3] = new Buku20(20, "Pemrograman Berbasis Objek", "Indrajani", 2005, 100);
        listBk[4] = new Buku20(1, "Dasar Pemrograman", "Abdul Kadir", 2004, 200);
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
    public int FindSeqSearch(int cari){
        System.out.println("Mencari Buku Dengan Sequential Search");
        int posisi = -1;
        for(int j=0; j<listBk.length; j++){
            if(listBk[j].kodeBuku == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    //tamplkan posisi
    public void TampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("data : "+x+" ditemukan pada indeks ke "+pos);
            listBk[pos].tampil();
        }else{
            System.out.println("data : "+x+" tidak ditemukan");
        }
    }
    //method findbuku
    public Buku20 FindBuku(int cari) {
        for (Buku20 buku : listBk) {
            if (buku.kodeBuku == cari) {
                return buku;
            }
        }
        return null;
    }
    //method findbinarysearch
    public int FindBinarySearch(int cari, int left, int right){
        System.out.println("Mencari Buku Dengan Binary Search");
        int mid;
        if(right >= left){
            mid = (left + right) / 2;
            if(cari == listBk[mid].kodeBuku){
                return (mid);
            }else if(listBk[mid].kodeBuku > cari){
                return FindBinarySearch(cari, left, mid-1);
            }else{
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
}
