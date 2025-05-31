package PRAK5;

public class Pegawai {
    protected String nama;
    protected int gajiPokok;
    
    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 5000000;
    }
    
    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}