class Tendik extends Karyawan {
    private static int count = 0;
    private static final double GAJI_POKOK = 4000000;

    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        count++;
    }

    public double hitungGaji() {
        return GAJI_POKOK + (masaKerja * 0.01 * GAJI_POKOK);
    }

    public void tampilkanInfo() {
        System.out.println("Tendik: " + nama);
        System.out.println("Email: " + email);
        System.out.println("NIP: " + NIP);
        System.out.println("Masa Kerja: " + masaKerja + " tahun");
        System.out.println("Gaji: Rp" + hitungGaji());
    }
}