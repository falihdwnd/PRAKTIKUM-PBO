package PRAK7.no10ab;

public class Anjing extends Anabul{
    private String ras;

    public Anjing(String nama, String ras) {
        super(nama);
        this.ras = ras;
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Guk-guk! (Ras: " + ras + ")");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan cara melata.");
    }
}
