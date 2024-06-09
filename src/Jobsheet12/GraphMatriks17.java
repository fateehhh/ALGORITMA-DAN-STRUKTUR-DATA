package Jobsheet12;

public class GraphMatriks17 {
    int vertex;
    int[][] matriks;

    public GraphMatriks17(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
        // matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = 0;

        // Menghitung in-degree
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][asal] != 0) {
                totalIn++;
            }
        }

        // Menghitung out-degree
        for (int j = 0; j < vertex; j++) {
            if (matriks[asal][j] != 0) {
                totalOut++;
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        System.out.println("=======================================================");
    }
}