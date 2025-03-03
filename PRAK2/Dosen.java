package PRAK2;

public class Dosen {
    /* ATRIBUT */
    private String nip;
    private String nama;
    private String prodi;

    // Konstruktor
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }
    
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor
    public String getnip() {
        return this.nip;
    }

    public String getnama() {
        return this.nama;
    }

    public String getprodi() {
        return this.prodi;
    }

    // Mutator
    public void setnip(String nip){
        this.nip = nip;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }
}
