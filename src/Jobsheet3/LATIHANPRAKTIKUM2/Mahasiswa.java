package Jobsheet3.LATIHANPRAKTIKUM2;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Masukkan berapa jumlah mahasiswa yang diinputkan: ");
        int n = sc17.nextInt();
        TampilanMahasiswa[] tampilan = new TampilanMahasiswa[n];

        for (int i = 0; i < n; i++) {
            tampilan[i] = new TampilanMahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            tampilan[i].nama = sc17.next();
            System.out.print("NIM: ");
            tampilan[i].nim = sc17.nextLong();
            System.out.print("Jenis Kelamin: ");
            tampilan[i].jenisKelamin = sc17.next();
            System.out.print("IPK: ");
            tampilan[i].IPK = sc17.nextDouble();
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + tampilan[i].nama);
            System.out.println("NIM: " + tampilan[i].nim);
            System.out.println("Jenis Kelamin: " + tampilan[i].jenisKelamin);
            System.out.println("IPK: " + tampilan[i].IPK);
            System.out.println();
        }
        System.out.println("Rata-rata IPK seluruh mahasiswa: " + hitungRataRataIPK(tampilan));
        System.out.printf("IPK terbesar: %.1f%n", hitungIPKTerbesar(tampilan));
        sc17.close();
    }

    public static double hitungRataRataIPK(TampilanMahasiswa[] tampilan) {
        double totalIPK = 0;
        for (TampilanMahasiswa mahasiswa : tampilan) {
            totalIPK += mahasiswa.IPK;
        }
        return totalIPK / tampilan.length;
    }

    public static double hitungIPKTerbesar(TampilanMahasiswa[] tampilan) {
        double ipkTerbesar = 0.0;
        for (TampilanMahasiswa mahasiswa : tampilan) {
            if (mahasiswa.IPK > ipkTerbesar) {
                ipkTerbesar = mahasiswa.IPK;
            }
        }
        return ipkTerbesar;
    }
}