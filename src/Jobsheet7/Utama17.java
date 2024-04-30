package Jobsheet7;

import java.util.Scanner;

public class Utama17 {
    public static void main(String[] args) {
        
        Gudang17 gudang = new Gudang17(7);
        Scanner sc17 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc17.nextInt();
            sc17.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc17.nextInt();
                    sc17.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc17.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc17.nextLine();
                    Barang17 barangBaru = new Barang17(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. silahkan coba lagi.");
                    break;
            }
        }
    }
}
