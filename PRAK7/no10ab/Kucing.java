package PRAK7.no10ab;

public class Kucing extends Anabul{
    private String jenis;

    public Kucing(String nama, String jenis) {
        super(nama);
        this.jenis = jenis;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong! (Jenis: " + jenis + ")");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}