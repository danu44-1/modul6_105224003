package rental;

public class Mobil extends Kendaraan {
    private int kapasitasPenumpang;

    // public int getKapasitasPenumpang() {
    //     return kapasitasPenumpang;
    // }

    // public void setKapasitasPenumpang(int kapasitasPenumpang) {
    //     this.kapasitasPenumpang = kapasitasPenumpang;
    // }

    public Mobil(String nomPol, String merk, int tahunP, double harga, int kapasitasPenumpang) {
        super(nomPol, merk, tahunP, harga);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public double hitungHargaSewa(int hari) {
        double total = super.hitungHargaSewa(hari);

        total += (50000 * hari);

        if (kapasitasPenumpang > 5) {
            total += 50000;
            return total;
        }

        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas penumpang sebanyak : " + this.kapasitasPenumpang + "\n");
    }


}
