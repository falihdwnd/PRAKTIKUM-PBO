package PRAK6;

abstract class Anabul {
    protected String nama;
    
    public Anabul(String nama) {
        this.nama = nama;
    }
    
    // Method abstract yang harus diimplementasikan oleh kelas anak
    public abstract void bersuara();
    public abstract void bergerak();
    
    public String getNama() {
        return nama;
    }
}