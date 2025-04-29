package PRAK6;

class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }
    
    @Override
    public void bersuara() {
        System.out.println(nama + " berbunyi: Cuit!");
    }
    
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }
}