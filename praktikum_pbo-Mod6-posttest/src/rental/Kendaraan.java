package rental;

public class Kendaraan {
    private String nomorPolisi;
    private String merk;
    private int tahunProduksi;
    private double hargaSewaDasar;

    Kendaraan(String nomPol, String merk, int tahunP, double harga){
        this.nomorPolisi = nomPol;
        this.merk = merk;
        this.tahunProduksi = tahunP;
        this.hargaSewaDasar = harga;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public double getHargaSewaDasar() {
        return hargaSewaDasar;
    }

    public void setNomorPolisi(String nomorPolisi) {
        this.nomorPolisi = nomorPolisi;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public void setHargaSewaDasar(double hargaSewaDasar) {
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo() {
        System.out.println("Nomor Polisi : " + this.nomorPolisi);
        System.out.println("Merk : " + this.merk);
        System.out.println("Tahun Produksi : " + this.tahunProduksi);
        System.out.println("Harga : " + this.hargaSewaDasar);
    } 

    public double hitungHargaSewa(int hari) {
        if (this.tahunProduksi < 2015) {
            double diskon = this.hargaSewaDasar * 0.10;
            return this.hargaSewaDasar -= diskon;
        }
        
        return this.hargaSewaDasar *= hari;

    }
}

