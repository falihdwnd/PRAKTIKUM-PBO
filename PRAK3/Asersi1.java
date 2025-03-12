package PRAK3;

public class Asersi1 {
    public static void main(String[] args) {
        int x = 17;
        if(x>0) {
            System.out.println("bilangan positif");
        }
        else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("bilangan negatif");
        }
    }
}
