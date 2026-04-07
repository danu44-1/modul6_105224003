package rental;

public class Motor extends Kendaraan {
    private int KapasitasMesin;

    // public int getKapasitasMesin() {
    //     return KapasitasMesin;
    // }

    // public void setKapasitasMesin(int kapasitasMesin) {
    //     KapasitasMesin = kapasitasMesin;
    // }

    public Motor(String nomPol, String merk, int tahunP, double harga, int kapasitasMesin) {
        super(nomPol, merk, tahunP, harga);
        this.KapasitasMesin = kapasitasMesin;
    }

    @Override
    public double hitungHargaSewa(int hari) {
        double total = super.hitungHargaSewa(hari);

        if (KapasitasMesin >= 250) {
            total += (25000 * hari);
            return total;
        }

        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Spek CC : " + KapasitasMesin + "\n");
    }

}
