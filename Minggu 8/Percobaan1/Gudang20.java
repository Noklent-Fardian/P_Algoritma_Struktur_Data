package Percobaan1;

public class Gudang20 {
    Barang20[] tumpukan;
    int size, top;
    

    public Gudang20(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang20[kapasitas];
        top = -1;
    }

    public boolean cekKosong() {
        if(top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if(top == size - 1) {
            return true;
        } else {
            return false;
        }
    }//
    //push
    public void tambahBarang(Barang20 brg){
        if(!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+ brg.nama+" berhasil ditambahkan Ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan Barang di gudang sudah penuh");

        }
    }
    //pop
    public Barang20 ambilBarang(){
        if(!cekKosong()){
            Barang20 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+ delete.nama+" berhasil diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Gagal! Tumpukan Barang di gudang sudah kosong");
            return null;
        }
    }

    //peek
    public Barang20 lihatBarangTeratas(){
        if(!cekKosong()){
            Barang20 barangTeratas= tumpukan[top];
            System.out.println("Barang teratas di Gudang adalah "+ barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang di gudang  kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan Barang di Gudang:");
            for(int i = top; i >= 0; i--){
                // for(int i=0; i<=top; i++){ -> ini bagian yang salah pada pertanyaan 1
                    System.out.printf("Kode: %d, Nama: %s, Kategori: %s\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan Baramng Kosong");
        }
    }
}
