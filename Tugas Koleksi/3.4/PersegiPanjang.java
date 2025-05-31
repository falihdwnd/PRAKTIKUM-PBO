package Tugas Koleksi.3.4;

public class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double hitungLuas() {
        return panjang * lebar;
    }
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}