package PRAK2;

public class MataKuliah {
    /* ATRIBUT */
    private String idMK;
    private String nama;
    private int sks;

    /* KONTRUKTOR */
    public MataKuliah() {
        idMK = "";
        nama = "";
        sks = 0;
    }

    public MataKuliah(String idMK, String nama, int sks) {
        this.idMK = idMK;
        this.nama = nama;
        this.sks = sks;
    }

    /* SELEKTOR */
    public String getidMK() {
        return this.idMK;
    }

    public String getnama() {
        return this.nama;
    }

    public int getsks() {
        return this.sks;
    }

    /* MUTATOR */
    public void setidMK(String idMK) {
        this.idMK = idMK;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }
    
    public void setsks(int sks) {
        this.sks = sks;
    }
}
