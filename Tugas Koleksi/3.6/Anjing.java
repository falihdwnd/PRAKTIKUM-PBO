package Tugas Koleksi.3.6;

public class Anjing extends Anabul{

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Guk-guk!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}
