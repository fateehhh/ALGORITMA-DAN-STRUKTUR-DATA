import java.util.Scanner;

public class Main_Fatih {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        Siswa_Fatih[] siswa = new Siswa_Fatih[6];
        Pencarian_fatih pencarian = new Pencarian_fatih();

        for (int i = 0; i < siswa.length; i++) {
            System.out.println("=========================================");
            System.out.println("Masukkan data siswa ke-" + (i + 1));
            System.out.print("Masukkan nisn siswa : ");
            siswa[i] = new Siswa_Fatih(null, null, null, 0, 0);
            siswa[i].nisnFatih = sc17.nextLine();
            System.out.print("Masukkan nama siswa: ");
            siswa[i].namaFatih = sc17.nextLine();
            System.out.print("Masukkan alamat siswa: ");
            siswa[i].alamatFatih = sc17.nextLine();
            System.out.print("Masukkan tahun masuk siswa: ");
            siswa[i].tahunFatih = sc17.nextInt();
            System.out.print("Masukkan nilai siswa: ");
            siswa[i].nilaiFatih = sc17.nextDouble();
            sc17.nextLine();
            System.out.println();

        }
        for (int i = 0; i < siswa.length; i++) {
            System.out.println("============================================");
            System.out.println("Tampil Semua Data Siswa");
            siswa[i].tampilSiswa();
        }

        System.out.println("===============================");
        System.out.println("Mencari Data");
        System.out.print("Masukkan nama yang dicari: ");
        String cari = sc17.nextLine();
        System.out.println("=======================================================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        pencarian.TampilData(cari, posisi);
        System.out.println("=======================================================");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, siswa.length-1);
        pencarian.TampilData(cari, posisi);
    }
}
