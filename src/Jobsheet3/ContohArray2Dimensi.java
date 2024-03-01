package Jobsheet3;

public class ContohArray2Dimensi {
    public static void main(String[] args) {
        Mahasiswa[][] Orang = new Mahasiswa[2][3];

        Orang[0][0] = new Mahasiswa("Akbar", 20);
        Orang[0][1] = new Mahasiswa("Firman", 19);
        Orang[0][2] = new Mahasiswa("Adam", 21);
        Orang[1][0] = new Mahasiswa("Eja", 18);
        Orang[1][1] = new Mahasiswa("Sultan", 19);
        Orang[1][2] = new Mahasiswa("Iqbal", 20);

        for (int i = 0; i < Orang.length; i++) {
            for (int j = 0; j < Orang[i].length; j++) {
                System.out.println(Orang[i][j].tampilan());
            }
        }
    }
}

class Mahasiswa {
    String nama;
    int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String tampilan() {
        return "Nama: " + this.nama + ", Umur: " + this.umur;
    }
}