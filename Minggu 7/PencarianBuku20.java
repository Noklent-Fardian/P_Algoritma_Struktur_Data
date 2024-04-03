public class PencarianBuku20 {
    Buku20 listBk[] = new Buku20[5];
    int idx;

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
    
}
