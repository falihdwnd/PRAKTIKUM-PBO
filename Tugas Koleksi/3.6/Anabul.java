package Tugas Koleksi.3.6;

public abstract class Anabul {
    // Atribut
    protected String nama;

    // Konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}   