package Jobsheet3;

import java.util.Scanner;

public class ArrayOfObject17 {
    public static class PersegiPanjang {
        public int panjang;
        public int lebar;
    }

    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.println("Tentukan berapa Persegi Panjang yang ingin anda buat");
        System.out.print("Jumlah: ");
        int n = sc17.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[n];
        
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc17.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc17.nextInt();
        }
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
        sc17.close();
    }

}
