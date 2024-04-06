package Jobsheet6.TestSearching.src;

public class PencarianBuku17 {
    Buku17 ListBk[] = new Buku17[5];
    int idx;

    void tambah(Buku17 m) {
        if (idx < ListBk.length) {
            ListBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku17 m : ListBk) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = 0;
        for (int j = 0; j < ListBk.length; j++) {
            if (ListBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("data: " + x + " ditemukan pada index " + pos);
            System.out.println("==================================");
            System.out.println("Kode Buku: " + x);
            System.out.println("Judul: " + ListBk[pos].judulBuku);
            System.out.println("Tahun Terbit: " + ListBk[pos].tahunTerbit);
            System.out.println("Pengarang: " + ListBk[pos].pengarang);
            System.out.println("Stock: " + ListBk[pos].stock);
        } else {
            System.out.println("data: " + x + "tidak ditemukan");
        }
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right) / 2;
            if (cari == ListBk[mid].kodeBuku) {
                return (mid);
            } else if (ListBk[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid -1 , right);
            }
        }
        return -1;
    }
}