package Jobsheet6.TestSearching.src;

import java.util.Scanner;

public class BukuMain17 {
    public static void main(String[] args) {
        Scanner s17 = new Scanner(System.in);
        Scanner s117 = new Scanner(System.in);

        PencarianBuku17 data = new PencarianBuku17();
        int jumBuku = 5;

        System.out.println("=======================================================");
        System.out.println("|Masukkan data Buku secara urut dari KodeBuku Terkecil|");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------");
            System.out.print("Kode Buku: ");
            int kodeBuku =  s17.nextInt();
            System.out.print("Judul Buku: ");
            String judulBuku = s117.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = s17.nextInt();
            System.out.print("Pengarang: ");
            String pengarang = s117.nextLine();
            System.out.print("Stock: ");
            int stock = s17.nextInt();

            Buku17 m = new Buku17(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan buku : ");
        data.tampil();

        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        System.out.println("Pencarian Data");
        System.out.println("Mauskkan nama buku yang dicari: ");
        System.out.print("Nama Buku: ");
        String cari = s17.nextLine();
        cari = s17.next();
        Buku17 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();
    }
}
