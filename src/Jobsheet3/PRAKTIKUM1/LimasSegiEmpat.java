package Jobsheet3.PRAKTIKUM1;

import java.lang.Math;

public class LimasSegiEmpat {
    double sisi;
    double tinggi;

    public LimasSegiEmpat (double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;   
    }
    public double LuasPermukaan (){
        double hipotenusa = (0.5*(sisi*sisi)+(tinggi*tinggi));
        double LPSegitiga = 4*(0.5*sisi*hipotenusa);
        double LPLimas = (Math.pow(sisi, 2)) + LPSegitiga;
        return LPLimas;
    }
    public double Volume(){
        double VLimas = (1.0/3.0) * Math.pow(sisi, 2) * tinggi;
        return VLimas;
    }
}
