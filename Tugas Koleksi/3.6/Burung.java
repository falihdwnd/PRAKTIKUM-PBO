package Tugas Koleksi.3.6;

public class Burung extends Anabul{

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Cuit!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara terbang.");
    }
}
