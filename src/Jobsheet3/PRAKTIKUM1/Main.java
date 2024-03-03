package Jobsheet3.PRAKTIKUM1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        Kerucut [] krct = new Kerucut[1];
        LimasSegiEmpat [] lms = new LimasSegiEmpat[1];
        Bola [] bl = new Bola[1];

        for (int i = 0; i < 1; i++) {
            krct[i] = new Kerucut(i, i);
            System.out.println("====== KERUCUT ======");
            System.out.print("Masukkan jari jari: ");
            krct[i].jarijari = sc17.nextDouble();
            System.out.print("Masukkan sisi Miring: ");
            krct[i].sisiMiring = sc17.nextDouble();
            System.out.println("=====================");
            System.out.printf("Luas Permukaan: %.2f%n", krct[i].LuasPermukaan());
            System.out.printf("Volume: %.2f%n", krct[i].Volume());
            System.out.println();
            
            
            lms[i] = new LimasSegiEmpat(i, i);
            System.out.println("====== LIMAS SEGI EMPAT ======");
            System.out.print("Masukkan sisi: ");
            lms[i].sisi = sc17.nextDouble();
            System.out.print("Masukkan tinggi: ");
            lms[i].tinggi = sc17.nextDouble();
            System.out.println("==============================");
            System.out.printf("Luas Permukaan: %.2f%n", lms[i].LuasPermukaan());
            System.out.printf("Volume: %.2f%n", lms[i].Volume());
            System.out.println();
            

            bl[i] = new Bola(i);
            System.out.println("====== BOLA ======");
            System.out.print("Masukkan jari jari: ");
            bl[i].jarijari = sc17.nextDouble();
            System.out.println("==================");
            System.out.printf("Luas Permukaan: %.2f%n", bl[i].LuasPermukaan());
            System.out.printf("Volume: %.2f%n", bl[i].Volume());
            System.out.println();
        }
        
        
    }
}