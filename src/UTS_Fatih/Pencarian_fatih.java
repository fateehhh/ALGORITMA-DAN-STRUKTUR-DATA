public class Pencarian_fatih {
    Siswa_Fatih[] ListSiswa = new Siswa_Fatih[6];
    int idx;
    void tambah(Siswa_Fatih m) {
        if (idx < ListSiswa.length) {
            ListSiswa[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }
    void tampil(){
        for (Siswa_Fatih a : ListSiswa) {
            a.tampilSiswa();
        }
    }
    public int FindSeqSearch(String cari) {
        int posisi = 0;
        for (int j = 0; j < ListSiswa.length; j++) {
            if (ListSiswa[j].namaFatih == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == ListSiswa[mid].namaFatih) {
                return (mid);
            } else if (ListSiswa[mid].namaFatih >= cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    public void TampilData(String x, int pos) {
        if (pos != -1) {
            System.out.println("==================================");
            System.out.println("NISN: " + ListSiswa[pos].nisnFatih);
            System.out.println("nama: " + ListSiswa[pos].namaFatih);
            System.out.println("Alamat: " + ListSiswa[pos].alamatFatih);
            System.out.println("Tahun Masuk: " + ListSiswa[pos].tahunFatih);
            System.out.println("Nilai: " + ListSiswa[pos].nilaiFatih);
        } else {
            System.out.println("data: " + x + "tidak ditemukan");
        }
    }
}
