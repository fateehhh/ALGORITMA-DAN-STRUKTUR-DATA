package Jobsheet3;

public class PersegiPanjang {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang) {
        this.panjang = panjang;
        this.lebar = 1; 
        System.out.println("Membuat persegi panjang dengan panjang " + panjang + " dan lebar default 1");
    }

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Membuat persegi panjang dengan panjang " + panjang + " dan lebar " + lebar);
    }

    public int getLuas() {
        return panjang * lebar;
    }

    public void cetakInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + getLuas());
    }

    public static void main(String[] args) {
        PersegiPanjang p1 = new PersegiPanjang(5);
        p1.cetakInfo();

        System.out.println();

        PersegiPanjang p2 = new PersegiPanjang(4, 3);
        p2.cetakInfo();
    }
}