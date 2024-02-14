package jobsheet1;

import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        String[] mataKuliah = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };
        int[] bobotSKS = { 2, 2, 3, 2, 2, 2, 3, 2 };
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        System.out.println("==================================");
        System.out.println("| Program Menghitung IP Semester |");
        System.out.println("==================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("Masukkan nilai angka MK %s : ", mataKuliah[i]);
            nilaiAngka[i] = sc17.nextDouble();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
            }
            bobotNilai[i] = (nilaiHuruf[i].equals("A")) ? 4.0
                        : (nilaiHuruf[i].equals("B+")) ? 3.5
                        : (nilaiHuruf[i].equals("B")) ? 3.0
                        : (nilaiHuruf[i].equals("C+")) ? 2.5
                        : (nilaiHuruf[i].equals("C")) ? 2.0 
                        : (nilaiHuruf[i].equals("D")) ? 1.0 
                        : 0;
        }
        System.out.println("==================");
        System.out.println("| Konversi Nilai |");
        System.out.println("==================");
        System.out.printf("%-40s %-20s %-15s %15s%n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.printf("%-40s %-20s %-15s %15s%n", "------------------------", "-------------", "-----------",
                "-----------");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-20.2f %-15s %9.2f%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    bobotNilai[i]);
            bobotNilai[i] *= bobotSKS[i];
        }
        double totalBobotNilai = 0;
        for (int i = 0; i < bobotNilai.length; i++) {
            totalBobotNilai += bobotNilai[i];
        }
        double nilaiIp = (double) totalBobotNilai / 18;
        System.out.println("=========================");
        System.out.printf("IP semester: %.2f%n", nilaiIp);

        sc17.close();
    }
}
