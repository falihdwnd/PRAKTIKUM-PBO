public class Main {
    public static void main(String[] args) {
        Fakultas teknik = new Fakultas("Teknik", 5000000, 7000000);
        Fakultas ekonomi = new Fakultas("Ekonomi", 4500000, 6500000);

        Mahasiswa mhs1 = new Mahasiswa("Ali", "ali@email.com", "12345", 3, teknik);
        Mahasiswa mhs2 = new Mahasiswa("Budi", "budi@email.com", "67890", 2, ekonomi);

        Dosen dosen1 = new Dosen("Dr. Rina", "rina@email.com", "98765", 10, teknik);
        Tendik tendik1 = new Tendik("Siti", "siti@email.com", "54321", 5);

        mhs1.tampilkanInfo();
        System.out.println();
        mhs2.tampilkanInfo();
        System.out.println();
        dosen1.tampilkanInfo();
        System.out.println();
        tendik1.tampilkanInfo();
    }
}