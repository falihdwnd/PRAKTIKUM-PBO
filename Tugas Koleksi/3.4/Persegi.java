package Tugas Koleksi.3.4;

public class Persegi extends BangunDatar {
    private double sisi;
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    public double hitungLuas() {
        return sisi * sisi;
    }
    public double hitungKeliling() {
        return 4 * sisi;
    }
}