package UTS_Fatih;

public class Siswa_Fatih {
    String nisnFatih;
    String namaFatih;
    String alamatFatih;
    int tahunFatih;
    double nilaiFatih;

    public Siswa_Fatih(String nisn, String nama, String alamat, int tahun, double nilai){
        nisnFatih = nisn;
        namaFatih = nama;
        alamatFatih = alamat;
        tahunFatih = tahun;
        nilaiFatih = nilai;
    }
    public void tampilSiswa(){
        System.out.println("NISN: " + nisnFatih);
        System.out.println("Nama: " + namaFatih);
        System.out.println("Alamat: " + alamatFatih);
        System.out.println("Tahun Masuk: " + tahunFatih);
        System.out.println("Nilai: " + nilaiFatih);
    }
    
}