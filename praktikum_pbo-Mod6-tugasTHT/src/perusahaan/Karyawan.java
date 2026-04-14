package perusahaan;

public class Karyawan {
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;

    public Karyawan(String id, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) { // Construtor untuk inisialisasi data di setiap atributnya
        this.idKaryawan = id;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0;
        }
        else {
            this.ratingKinerja = ratingKinerja;
        }
    }

    // getter untuk mengambil atau mendapatkan nilai/data dari atribut
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getRatingKinerja() {
        return ratingKinerja;
    }

    // setter untuk mengubah/set nilai pada atribut dan membuat data bisa diset secara publik
    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setRatingKinerja(double ratingKinerja) {
        this.ratingKinerja = ratingKinerja;
    }


    public double hitungGajiTotal() { // Method untuk logika perhitungan total gajinya yang ditambah 5% bonus loyalitas dan pemotongan dengan penalti di kondisi tertentu

        int masaKerja = 2026 - this.tahunMasuk;

        if (masaKerja < 0) {
            masaKerja = 0;
        }

        double bonus = (gajiPokok * 0.05) * masaKerja;

        double total = gajiPokok + bonus;

        if (ratingKinerja < 2.5) {
            total -= (total * 0.10);
        }

        //this.gajiPokok = total;

        return total;

    }

    public void displayInfo() { // method untuk mencetak setiap datanya
        System.out.println("ID : " + this.idKaryawan);
        System.out.println("Nama : " + this.nama);
        System.out.println("Tahun Masuk : " + this.tahunMasuk);
        System.out.println("Rating : " + this.ratingKinerja);
        System.out.println("Gaji : Rp." + this.gajiPokok);
    }

}
