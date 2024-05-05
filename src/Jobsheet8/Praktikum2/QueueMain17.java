package Jobsheet8.Praktikum2;

import java.util.Scanner;

public class QueueMain17 {
    public static void menu(){
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("--------------------");
    }
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian: ");
        int Jumlah = sc17.nextInt();

        Queue17 antri17 = new Queue17(Jumlah);
        int pilih;

        do {
            menu();
            pilih = sc17.nextInt();
            sc17.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc17.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc17.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc17.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc17.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc17.nextDouble();
                    Nasabah17 nb = new Nasabah17(norek, nama, alamat, umur, saldo);
                    antri17.Enqueue(nb);
                    break;
                case 2:
                    Nasabah17 data = antri17.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                    && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + 
                        " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri17.peek();
                    break;
                case 4:
                    antri17.Print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4); 
    }
}
