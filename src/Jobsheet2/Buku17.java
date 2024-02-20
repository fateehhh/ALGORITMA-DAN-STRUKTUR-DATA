package Jobsheet2;

class Buku17 {
    String judul, pengarang;
    int halaman, stok, harga;

    void TampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            if (jml <= stok) {
                stok -= jml;
            }
        } else {
            System.out.println("Stok buku habis. Penjualan tidak dapat dilakukan.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku17() {

    }

    public Buku17(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}
