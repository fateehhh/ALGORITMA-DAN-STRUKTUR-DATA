package Jobsheet3;

public class Segitiga {
    public int alas;
    public int tinggi;
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    public double hitungLuas(){
        double luas = 0.5 * alas *tinggi;
        return luas;
    }
    public double kelilingSegitiga(){
        double hipotenusa = Math.sqrt(alas * alas + tinggi * tinggi);//menghitung phyagoras menggunakan perhitungan hipotenusa
        double keliling = alas + tinggi + hipotenusa;
        return keliling;
    }
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[0] = new Segitiga(25, 10);
    }
}