package Jobsheet3.PRAKTIKUM1;

import java.lang.Math;

public class Kerucut {
        double jarijari;
        double sisiMiring;

        public Kerucut(double jarijari, double sisiMiring){
            this.jarijari = jarijari;
            this.sisiMiring = sisiMiring;
        }

        public double LuasPermukaan(){
            return (3.14 * jarijari) * (jarijari + sisiMiring);
        }

        public double Volume (){
            return (1.0/3.0) * 3.14 * Math.pow(jarijari, 2) * (Math.pow(sisiMiring, 2)-Math.pow(jarijari, 2));
        }
}
