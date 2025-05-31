package PRAK7.no10ab;

public class Burung extends Anabul{
        private String spesies;
    
        public Burung(String nama, String spesies) {
            super(nama);
            this.spesies = spesies;
        }
    
        @Override
        public void bersuara() {
            System.out.println(nama + " berbunyi: Cuit! (Spesies: " + spesies + ")");
        }
    
        @Override
        public void bergerak() {
            System.out.println(nama + " bergerak dengan cara terbang.");
        }
}