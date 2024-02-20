package Jobsheet2;

public class BukuMain17 {
    public static void main(String[] args) {
        Buku17 bk1 = new Buku17();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.TampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.TampilInformasi();

        Buku17 bk2 = new Buku17("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.TampilInformasi();

        Buku17 bukuFateh = new Buku17("Pengantar Java", "Riandi Gunawan", 300, 20, 80000);
        bukuFateh.terjual(5);
        bukuFateh.TampilInformasi();
    }

}
