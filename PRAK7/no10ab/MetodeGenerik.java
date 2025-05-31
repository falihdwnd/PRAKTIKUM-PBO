package PRAK7.no10ab;

public class MetodeGenerik {
    public <T extends Anabul> void tampilkanPerilaku(Datum<T> data) {
        T hewan = data.getIsi();
        hewan.bersuara();
        hewan.bergerak();
    }
}