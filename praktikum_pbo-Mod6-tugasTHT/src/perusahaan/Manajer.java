package perusahaan;

public class Manajer extends Karyawan {
    private String divisi;
    private int jumlahAnggotaTim;

    public Manajer(String id, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggota) { // Construtor untuk inisialisasi data di setiap atributnya
        super(id, nama, tahunMasuk, gajiPokok, ratingKinerja);
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggota;
    }

    // getter untuk mengambil atau mendapatkan nilai/data dari atribut
    public String getDivisi() {
        return divisi;
    }

    public int getJumlahAnggotaTim() {
        return jumlahAnggotaTim;
    }


    // setter untuk mengubah/set nilai pada atribut dan membuat data bisa diset secara publik
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }

    public void setJumlahAnggotaTim(int jumlahAnggotaTim) {
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    @Override // untuk pemanggilan method dari kelas induk
    public double hitungGajiTotal() {
        double gaji = super.hitungGajiTotal();

        double tunjanganManajer = jumlahAnggotaTim * 300000;

        double total = gaji + tunjanganManajer;

        if (getRatingKinerja() >= 4.5) {
            total += (0.15 * total);
        }

        //this.setGajiPokok(total);

        return total;
    }

    @Override // untuk pemanggilan method dari kelas induk
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level : " + this.divisi);
        System.out.println("Jumlah Anggota Tim : " + this.jumlahAnggotaTim);
        System.out.println("Total Gaji Dengan Tunjangan Manajerial dan Bonus Kinerja : " + this.hitungGajiTotal());
    }
}
