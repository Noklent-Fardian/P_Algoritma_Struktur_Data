public class controllerNoklent {
    siswaNoklent arrNoklent[] = new siswaNoklent[0];

    public void showDataNoklent() {
        String firstLineNoklent = "╔═════╦════════════╦═══════════════════════════╦═══════════════════════════╦═══════╦═══════╗";
        String middleLineNoklent = "╠═════╬════════════╬═══════════════════════════╬═══════════════════════════╬═══════╬═══════╣";
        String lastLineNoklent = "╚═════╩════════════╩═══════════════════════════╩═══════════════════════════╩═══════╩═══════╝";
        String formatTableNoklent = "║ %-3s ║ %-10s ║ %-25s ║  %-25s║  %-5s║  %-5s║%n";
        System.out.println(firstLineNoklent);
        System.out.println(
                "║ NO  ║ NISN       ║ NAMA                      ║ Alamat                    ║ Tahun ║ Nilai ║");
        System.out.println(middleLineNoklent);
        for (int i = 0; i < arrNoklent.length; i++) {
            System.out.printf(formatTableNoklent, i + 1, arrNoklent[i].nisnNoklent, arrNoklent[i].namaNoklent,
                    arrNoklent[i].alamatNoklent, arrNoklent[i].tahunNoklent, arrNoklent[i].nilaiNoklent);
            System.out.println(middleLineNoklent);
        }
        System.out.println(lastLineNoklent);
    }

    /*
     * ===========================================================================
     */
    /* Soal Ke 1 */
    public void sortNisnNoklent() {
        for (int i = 1; i < arrNoklent.length; i++) {
            siswaNoklent keyNoklent = arrNoklent[i];
            int j = i - 1;
            // while (j >= 0 && arrNoklent[j].nisnNoklent.compareTo(keyNoklent.nisnNoklent) < 0) {
            while (j >= 0 && Integer.parseInt(arrNoklent[j].nisnNoklent)>Integer.parseInt(keyNoklent.nisnNoklent)) {
                arrNoklent[j + 1] = arrNoklent[j];
                j = j - 1;
            }
            arrNoklent[j + 1] = keyNoklent;
        }
    }
    public void searchNisnNoklent(String carinisnNoklent) {
        int leftNoklent = 0;
        int rightNoklent = arrNoklent.length - 1;
        boolean foundNoklent = false;
        while (leftNoklent <= rightNoklent) {
            int midNoklent = leftNoklent + (rightNoklent - leftNoklent) / 2;
            if (arrNoklent[midNoklent].nisnNoklent.compareTo(carinisnNoklent) == 0) {
                foundNoklent = true;
                System.out.println("=================================");
                System.out.println("Siswa Dengan NISN "+ arrNoklent[midNoklent].nisnNoklent+" Telah Ditemukan !!!");
                System.out.println("=================================");
                System.out.println("NISN: " + arrNoklent[midNoklent].nisnNoklent);
                System.out.println("Nama: " + arrNoklent[midNoklent].namaNoklent);
                System.out.println("Alamat: " + arrNoklent[midNoklent].alamatNoklent);
                System.out.println("Tahun: " + arrNoklent[midNoklent].tahunNoklent);
                System.out.println("Nilai: " + arrNoklent[midNoklent].nilaiNoklent);
                System.out.println("=================================");
                break;
            } else if (arrNoklent[midNoklent].nisnNoklent.compareTo(carinisnNoklent) < 0) {
                leftNoklent = midNoklent + 1;
            } else {
                rightNoklent = midNoklent - 1;
            }
        }
        if (!foundNoklent) {
            System.out.println("=================================");
            System.out.println("Data Siswa tidak ditemukan !!!!");
            System.out.println("=================================");
        }
    }


    /*
     * =========================================================================
     */
    /* Soal Ke 2 */
    public void sortNilaiNoklent() {
        for (int i = 1; i < arrNoklent.length; i++) {
            siswaNoklent keyNoklent = arrNoklent[i];
            int j = i - 1;
            while (j >= 0 && arrNoklent[j].nilaiNoklent < keyNoklent.nilaiNoklent) {
                arrNoklent[j + 1] = arrNoklent[j];
                j = j - 1;
            }
            arrNoklent[j + 1] = keyNoklent;
        }
        System.out.println("==================================================================");
        System.out.println("Data Siswa Berhasil Diurutkan Berdasarkan Nilai");
        System.out.println("==================================================================");
        showDataNoklent();
    }
    /* ========================================================================== */

}
