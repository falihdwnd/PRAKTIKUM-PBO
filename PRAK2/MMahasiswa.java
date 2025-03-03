package PRAK2;

public class MMahasiswa {
    public static void main(String[] args) {
    MataKuliah GKV = new MataKuliah("GKV", "Grafika Komputasi Visual", 3);
    MataKuliah BasDat = new MataKuliah("BasDat", "Basis Data", 4);
    MataKuliah Daspro = new MataKuliah("Daspro", "Dasar Pemrograman", 3);
    MataKuliah Alpro = new MataKuliah("Alpro", "Algoritma Pemrograman", 4);
    MataKuliah Bing = new MataKuliah("B.ing", "Bahasa Inggris", 2);
    MataKuliah OAK = new MataKuliah("OAK", "Organisasi dan Arsitektur Komputer", 3);
    MataKuliah Alin = new MataKuliah("Alin", "Aljabar Linier", 3);
    MataKuliah KWU = new MataKuliah("KWU", "Kewirausahaan", 2);
    Mahasiswa M1 = new Mahasiswa("201", "Ilham", "Informatika");
    Dosen D1 = new Dosen("205", "Fahrul", "Informatika");
    Kendaraan K1 = new Kendaraan("T 1209 PQ", "Kapal");
    M1.setDosenWali(D1);
    M1.setKendaraan(K1);
    M1.addMatkul(GKV);
    M1.addMatkul(BasDat);
    M1.addMatkul(Alpro);
    M1.addMatkul(Daspro);
    M1.addMatkul(KWU);
    M1.addMatkul(Alin);
    M1.addMatkul(OAK);
    M1.addMatkul(Bing);
    M1.printDetailMhs();
    }
}