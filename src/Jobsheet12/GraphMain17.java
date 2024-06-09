package Jobsheet12;

import java.util.Scanner;

public class GraphMain17 {
    public static void main(String[] args) throws Exception {
        // Scanner sc17 = new Scanner(System.in);
        // Graph17 gedung = new Graph17(6);
        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // System.out.print("Masukkan gedung asal: ");
        // int asal = sc17.nextInt();
        // System.out.print("Masukkan gedung tujuan: ");
        // int tujuan = sc17.nextInt();
        // gedung.printCekTetangga(asal, tujuan);

        GraphMatriks17 gdg = new GraphMatriks17(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        System.out.println();
        gdg.degree(0);
        gdg.degree(1);
        gdg.degree(2);
        gdg.degree(3);

    }
}
