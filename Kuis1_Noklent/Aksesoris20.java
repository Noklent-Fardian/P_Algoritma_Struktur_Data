/**
 * Aksesoris20
 */
public class Aksesoris20 {
    int harga20,terjual20;
    String nama20,kategori20;

    //konstruktor
    public Aksesoris20(int harga20, int terjual20, String nama20, String kategori20) {
        this.harga20 = harga20;
        this.terjual20 = terjual20;
        this.nama20 = nama20;
        this.kategori20 = kategori20;
    }
    //konstruktor
    public Aksesoris20() {
    }
    //tampil method
    public void tampil20(Aksesoris20[] aksesoris20) {
      
            System.out.println("=========================================");
            System.out.println("Toko Aksesoris 20");
            System.out.println("=========================================");
            String firstLine = "╔═══════════════════════╦══════════╦══════════╦══════════╗";
            String middleLine = "╠═══════════════════════╬══════════╬══════════╬══════════╣";
            String lastLine = "╚═══════════════════════╩══════════╩══════════╩══════════╝";
            String formatTable = "║ %-21s ║  %-7s ║  %-7s ║ %-9s║%n";
            System.out.println(firstLine);
            System.out
                    .println("║ Nama                  ║ Kategori ║  Harga   ║ Terjual  ║");
            System.out.println(middleLine);
            for (int i = 0; i < aksesoris20.length; i++) {
                System.out.printf(formatTable, aksesoris20[i].nama20, aksesoris20[i].kategori20, aksesoris20[i].harga20,
                        aksesoris20[i].terjual20);
                System.out.println(middleLine);
            }
        
            System.out.println(lastLine);
            return;
    }
    //method hitung
    public int hitung20(Aksesoris20[] aksesoris20) {
        int total20 = 0;
        System.out.println("=========================================");
            String firstLine = "╔═══════════════════════╦══════════╦══════════╦══════════╦════════════════════╗";
            String middleLine = "╠═══════════════════════╬══════════╬══════════╬══════════╬════════════════════╣";
            String lastLine = "╚═══════════════════════╩══════════╩══════════╩══════════╩════════════════════╝";
            String formatTable = "║ %-21s ║  %-7s ║  %-7s ║ %-9s║ %-19s║%n";
            System.out.println(firstLine);
            System.out
                    .println("║ Nama                  ║ Kategori ║  Harga   ║ Terjual  ║ Total              ║");
            System.out.println(middleLine);
            for (int i = 0; i < aksesoris20.length; i++) {
                System.out.printf(formatTable, aksesoris20[i].nama20, aksesoris20[i].kategori20, aksesoris20[i].harga20,
                        aksesoris20[i].terjual20, aksesoris20[i].harga20 * aksesoris20[i].terjual20);
                System.out.println(middleLine);
            }
        
            System.out.println(lastLine);
        for (int i = 0; i < aksesoris20.length; i++) {
            total20 += aksesoris20[i].harga20 * aksesoris20[i].terjual20;
        }
            return total20;
        
    }
    //method urutkan berdasarkan harga terendah
    public void cariAksesorisTermurah20(Aksesoris20[] aksesoris20) {
        for (int i = 0; i < aksesoris20.length; i++) {
            for (int j = 0; j < aksesoris20.length; j++) {
                if (aksesoris20[i].harga20 < aksesoris20[j].harga20) {
                    Aksesoris20 temp = aksesoris20[i];
                    aksesoris20[i] = aksesoris20[j];
                    aksesoris20[j] = temp;
                }
            }
        }
        tampil20(aksesoris20);
    }
    //method urutkan berdasarkan nama
    public void daftarAksesoris20(Aksesoris20[] aksesoris20) {
        for (int i = 0; i < aksesoris20.length; i++) {
            for (int j = 0; j < aksesoris20.length; j++) {
                if (aksesoris20[i].nama20.compareTo(aksesoris20[j].nama20) < 0) {
                    Aksesoris20 temp = aksesoris20[i];
                    aksesoris20[i] = aksesoris20[j];
                    aksesoris20[j] = temp;
                }
            }
        }
        tampil20(aksesoris20);
    }


}