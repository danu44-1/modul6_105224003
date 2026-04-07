import java.util.ArrayList;

import rental.*;

public class main {
    public static void main(String[] args) throws Exception {
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

        daftarKendaraan.add(new Mobil("AAABC", "Honda", 2013, 50000, 6));
        daftarKendaraan.add(new Mobil("BBBBC", "BMW", 2019, 50000, 4));
        daftarKendaraan.add(new Motor("CCCCC", "Supra", 2019, 50000, 260));
        daftarKendaraan.add(new Motor("DDDDD", "Kirana", 2019, 50000, 240));

        for (Kendaraan dKendaraan : daftarKendaraan) {
            dKendaraan.displayInfo();
            System.out.println("Total Biaya Sewa selama 5 Hari: " + dKendaraan.hitungHargaSewa(5) + "\n");
        }
    }
}
