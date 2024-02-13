package jobsheet1;

import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        float kuis = 0.2F, tugas = 0.2F, UTS = 0.3F, UAS = 0.3F;
        float[] nilaiTotal = new float[1];

        System.out.println("================================");
        System.out.println("|Program Menghitung Nilai Akhir|");
        System.out.println("================================");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc17.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc17.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc17.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc17.nextInt();
        System.out.println("================================");

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100) {
            System.out.println("================================");
            System.out.println("Nilai tidak valid!");
            System.out.println("================================");
            main(args);
        } else {
            nilaiTotal[0] = (float) (tugas * nilaiTugas) + (kuis * nilaiKuis) + (UTS * nilaiUTS) + (UAS * nilaiUAS);
            System.out.println("================================");
            System.out.println("Nilai akhir: " + nilaiTotal[0]);
            if (nilaiTotal[0] > 80 || nilaiTotal[0] <= 100) {
                System.out.println("Nilai Huruf: A ");
                System.out.println("================================");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiTotal[0] > 73 || nilaiTotal[0] <= 80) {
                System.out.println("Nilai Huruf: B+ ");
                System.out.println("================================");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiTotal[0] > 65 || nilaiTotal[0] <= 73) {
                System.out.println("Nilai Huruf: B ");
                System.out.println("================================");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiTotal[0] > 60 || nilaiTotal[0] <= 65) {
                System.out.println("Nilai Huruf: C+ ");
                System.out.println("================================");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiTotal[0] > 50 || nilaiTotal[0] <= 60) {
                System.out.println("Nilai Huruf: C ");
                System.out.println("================================");
                System.out.println("SELAMAT ANDA LULUS!");
            } else if (nilaiTotal[0] > 39 || nilaiTotal[0] <= 50) {
                System.out.println("Nilai Huruf: D ");
                System.out.println("================================");
                System.out.println("MOHON MAAF ANDA TIDAK LULUS!");
            } else if (nilaiTotal[0] <= 39) {
                System.out.println("Nilai Huruf: E ");
                System.out.println("================================");
                System.out.println("MOHON MAAF ANDA TIDAK LULUS!");
            }
        }
    }
}