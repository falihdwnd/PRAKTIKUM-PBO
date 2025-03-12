package PRAK3;

class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }
    public double hitungKel() {
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert(jarijari>0):"Jari jari tidak boleh 0";
        Lingkaran l = new Lingkaran(jarijari);
        double kelLingkaran = l.hitungKel();
        System.out.println("Keliling Lingkaran = " + kelLingkaran);
    }
}

/* PERTANYAAN: secara konsep, ada yang kurang tepat pada program asersi2 diatas. jelaskan pada lembar laporan praktikum! */

/* JAWABAN:perintah assert diatas memeriksa apakah jari-jari > 0, jika tidak akan memunculkan pesan error. Namun, untuk 
menjalankan asersi di java, perlu menggunakan -enableassertions. program ini dimaksudkan untuk menolak input jari-jari lingkaran 
yang bernilai nol atau negatif.Namun jika program dijalankan tanpa -enableassertions, asersi akan diabaikan dan program 
akan tetap menerima nilai jari-jari negatif atau nol. Sehingga kita harus memastikan bahwa program selalu dijalankan dengan -enableassertion */