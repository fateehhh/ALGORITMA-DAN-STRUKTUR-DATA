package Jobsheet3;

public class Balok17 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok17(int p, int l, int t){ 
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume(){
        return panjang*lebar*tinggi;
    }
    public static void main(String[] args) {
        Balok17[] blArray = new Balok17[3];
        blArray[0] = new Balok17(100, 30, 12);
        blArray[1] = new Balok17(120,40, 15);
        blArray[2] = new Balok17(210, 50, 25);

        for (int i = 0; i < 3; i++) {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }
    } 
}
