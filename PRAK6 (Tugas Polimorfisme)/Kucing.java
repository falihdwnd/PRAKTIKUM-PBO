package PRAK6;

class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Meong!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan melata");
    }
}