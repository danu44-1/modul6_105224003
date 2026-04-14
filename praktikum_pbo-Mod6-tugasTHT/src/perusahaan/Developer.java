package perusahaan;

public class Developer extends Karyawan {
    private String level;
    private int jumlahBugFix;

    public Developer(String id, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBug) { // Construtor untuk inisialisasi data di setiap atributnya
        super(id, nama, tahunMasuk, gajiPokok, ratingKinerja);
        if (level == "Junior" || level == "Mid" || level == "Senior") {
            this.level = level;
        }
        else {
            //this.level = "Junior";
        }
        this.jumlahBugFix = jumlahBug;
    }

    // getter untuk mengambil atau mendapatkan nilai/data dari atribut
    public String getLevel() {
        return level;
    }

    public int getJumlahBugFix() {
        return jumlahBugFix;
    }


    // setter untuk mengubah/set nilai pada atribut dan membuat data bisa diset secara publik
    public void setLevel(String level) {
        this.level = level;
    }

    public void setJumlahBugFix(int jumlahBugFix) {
        this.jumlahBugFix = jumlahBugFix;
    }

    // public double getRatingKinerja() {
    //     return super.getRatingKinerja();
    // }

    @Override
    public double hitungGajiTotal() {       // Method untuk logika perhitungan gaji totalnya berdasarkan level dan bonus bug ketika ratingnya >= 3.0
        double total = super.hitungGajiTotal();

        if (level == "Junior") {
            total += 0;
        }
        else if (level == "Mid") {
            total += 1500000;
        }
        else if (level == "Senior") {
            total += 3000000;
        }

        if (getRatingKinerja() >= 3.0) {
            total += jumlahBugFix * 50000;
        }
        else {
            total += jumlahBugFix * 0;
        }

        //this.setGajiPokok(total);

        return total;
    }

    @Override // untuk pemanggilan method dari kelas induk
    public void displayInfo() { // method untuk mencetak setiap datanya
        super.displayInfo();
        System.out.println("Level : " + this.level);
        System.out.println("Jumlah Bug yang di Fix : " + this.jumlahBugFix);
        System.out.println("Total Gaji Dengan Level dan Bug yang di Fix : " + this.hitungGajiTotal());
    }

   
}
