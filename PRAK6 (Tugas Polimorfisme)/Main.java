package PRAK6;

public class Main {
    public static void main(String[] args) {
        // Membuat array dari objek Anabul
        Anabul[] daftarAnabul = new Anabul[3];
        
        // Mengisi array dengan objek dari kelas turunan
        daftarAnabul[0] = new Kucing("Meow");
        daftarAnabul[1] = new Anjing("Doggy");
        daftarAnabul[2] = new Burung("Tweety");
        
        // Menampilkan garis pembatas
        System.out.println("=== DEMONSTRASI POLIMORFISME ANABUL ===");
        
        // Mensimulasikan suara dan gerakan setiap anabul
        for (Anabul anabul : daftarAnabul) {
            System.out.println("\nInfo " + anabul.getClass().getSimpleName() + ":");
            System.out.println("Nama: " + anabul.getNama());
            anabul.bersuara();
            anabul.bergerak();
        }
    }
}