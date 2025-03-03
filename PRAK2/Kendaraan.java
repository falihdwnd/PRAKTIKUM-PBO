package PRAK2;

public class Kendaraan {
    /* ATRIBUT */
    private String noPlat;
    private String jenis;

    /* KONSTRUKTOR */
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis; 
    }

    /* SELEKTOR */
    public String getnoPlat() {
        return this.noPlat;
    }

    public String getjenis() {
        return this.jenis;
    }

    /* MUTATOR */
    public void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setjenis(String jenis) {
        this.jenis = jenis;
    }
}
