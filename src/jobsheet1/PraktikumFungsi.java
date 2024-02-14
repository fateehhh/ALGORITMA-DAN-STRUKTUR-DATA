package jobsheet1;

public class PraktikumFungsi {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7}, 
            {6, 11, 9, 12}, 
            {2, 10, 10, 5}, 
            {5, 7, 12, 9} 
        };
        
        double[] harga = {75_000, 50_000, 60_000, 10_000};

        for (int i = 0; i < stock.length; i++) {
            int totalPenjualan = perhitunganTotalPenjualan(stock[i], harga);
            System.out.printf("Pendapatan RoyalGarden %d: Rp. %,d%n", i + 1, totalPenjualan);
        }
    }

    private static int perhitunganTotalPenjualan(int[] stock, double[] harga) {
        int totalPenjualan = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] > 0) {
                totalPenjualan += harga[i] * stock[i];
            }
        }
        return totalPenjualan;
    }
}
