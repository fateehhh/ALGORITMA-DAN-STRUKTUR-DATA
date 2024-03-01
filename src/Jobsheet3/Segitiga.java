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
}