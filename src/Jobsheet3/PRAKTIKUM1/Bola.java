package Jobsheet3.PRAKTIKUM1;

import java.lang.Math;

public class Bola {
    double jarijari;
    
    public Bola (int jarijari){
        this.jarijari = jarijari;
    }

    public double LuasPermukaan (){
        double LPBola = 4.0 * 3.14 * Math.pow(jarijari, 2);
        return LPBola;
    }
    public double Volume (){
        double VBola = (4.0/3.0) * 3.14 * Math.pow(jarijari, 3);
        return VBola;
    }
}
