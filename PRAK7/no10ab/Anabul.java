package PRAK7.no10ab;

public class Anabul {
    // Atribut
    protected String nama;

    // Konstruktor
    public Anabul(String nama){
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(nama + " bersuara.");
    }

    public void bergerak() {
        System.out.println(nama + " bergerak.");
    }
}