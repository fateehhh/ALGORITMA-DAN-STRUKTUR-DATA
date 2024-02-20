package jobsheet1;

public class PraktikumFungsi {
    public static void main(String[] args) {
        int[][] stock = {
            {10, 5, 15, 7}, 
            {6, 11, 9, 12}, 
<<<<<<< HEAD
            {2, 10, 10, 5},
            {5, 7, 12, 9}  
=======
            {2, 10, 10, 5}, 
            {5, 7, 12, 9} 
>>>>>>> 85a83131cb31401c41747ad85a7200da1f9da046
        };

        double[] harga = {75_000, 50_000, 60_000, 10_000};

        for (int i = 0; i < stock.length; i++) {
            int totalPenjualan = perhitunganTotalPenjualan(stock[i], harga);
            System.out.printf("Pendapatan RoyalGarden %d: Rp. %,d%n", i + 1, totalPenjualan);
        }

        int[] royalGarden4 = stock[stock.length - 1];
        System.out.println("\nStock pada cabang RoyalGarden 4:");
        System.out.printf("Aglonema: %,d%n", royalGarden4[0]);
        System.out.printf("Keladi: %,d%n", royalGarden4[1]);
        System.out.printf("Alocasia: %,d%n", royalGarden4[2]);
        System.out.printf("Mawar: %,d%n", royalGarden4[3]);
        
        penguranganStok(royalGarden4, -1, -2, 0, -5);
        System.out.println("\nStock pada cabang RoyalGarden 4 setelah pengurangan akibat bunga mati:");
        System.out.printf("Aglonema: %,d%n", royalGarden4[0]);
        System.out.printf("Keladi: %,d%n", royalGarden4[1]);
        System.out.printf("Alocasia: %,d%n", royalGarden4[2]);
        System.out.printf("Mawar: %,d%n", royalGarden4[3]);
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

    private static void penguranganStok(int[] stock, int aglonema, int keladi, int alocasia, int mawar) {
        stock[0] += aglonema;
        stock[1] += keladi;
        stock[2] += alocasia;
        stock[3] += mawar;
    }
}