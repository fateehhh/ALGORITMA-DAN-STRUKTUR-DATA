package Jobsheet2;

class Buku17 {
    String judul, pengarang;
    int halaman, stok, harga, terjual, totalHarga;
    int jumTot, jumDis, jumBayar;
    double diskon;

    void TampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
        System.out.println("Harga Total: " + hitungHargaTotal());
        System.out.println("Harga Diskon: " + hitungDiskon());
        System.out.println("Harga Bayar: " + hitungHargaBayar());
        System.out.println("===================================");
    }

    void terjual(int jml) {
        if (stok > 0) {
            if (jml <= stok) {
                stok -= jml;
                terjual = jml;
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

    int hitungHargaTotal() {
        totalHarga = terjual * harga;
        return totalHarga;
    }

    int hitungDiskon() {

        if (hitungHargaTotal() > 150000) {
            diskon = hitungHargaTotal() * 0.12;
            int intDiskon = (int) diskon;
            return intDiskon;
        } else if (hitungHargaTotal() > 75000 || hitungHargaTotal() < 150000) {
            diskon = hitungHargaTotal() * 0.05;
            int intDiskon = (int) diskon;
            return intDiskon;
        } else {

        }
        return hitungDiskon();
    }

    int hitungHargaBayar() {
        jumTot = hitungHargaTotal();
        jumDis = hitungDiskon();
        jumBayar = jumTot - jumDis;
        return jumBayar;
    }
}
