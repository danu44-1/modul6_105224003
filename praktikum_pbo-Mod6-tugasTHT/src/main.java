import java.util.ArrayList;

import perusahaan.*;

public class main {
     public static void main(String[] args) throws Exception {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>(); // mendeklarasikan ArrayList dengan tipe superclass (Karyawan) dan memungkinkan untuk menyimpan berbagai objek turunan (Developer, Manajer) dalam satu list.

        // Mendaftarkan atau memasukkan objek Karyawan, Developer, dan Manajer dengan menambahkan datanya 
        daftarKaryawan.add(new Karyawan("100", "Danu", 2020, 3000000, 2.0));
        daftarKaryawan.add(new Developer("105105", "Dimas", 2018, 3000000, 4.0, "Senior", 20));
        daftarKaryawan.add(new Developer("224224", "Putra", 2024, 3000000, 2.8, "Mid", 15));
        daftarKaryawan.add(new Manajer("003003", "Dimput", 2015, 3000000, 4.8, "IT", 10));
        daftarKaryawan.add(new Manajer("300300", "Putdim", 2025, 3000000, 4.8, "HR", 3));

        // Digunakan untuk menampung hasil akumulasi data selama perulangan.
        double totalAnggran = 0;
        double gajiTertinggi = 0;
        double totalRating = 0;
        String namaGajiTertinggi = "";

        // Menulusuri setiap elemen di dalam arraylist
        for (Karyawan dKaryawan : daftarKaryawan) {
            double gajiSekarang = dKaryawan.hitungGajiTotal(); // Sintaks agar menjalankan logika perhintungan terlebih dahulu kemudian hasil pemanggilannya disimpan 
            dKaryawan.displayInfo();                           // Pemanggilan agar mencetak setiap atributnya
            System.out.println("Total Gaji Bulan ini : Rp." + gajiSekarang + "\n"); // Kemudian mencetak hasil perhitungan gaji yang baru saja disimpan di variabel gajiSekarang.

            totalAnggran += gajiSekarang; // Menambahkan gaji saat ini ke total anggaran perusahaan untuk akumulasi perhitungannya.

            totalRating += dKaryawan.getRatingKinerja(); // Menambahkan rating dari setiap karyawan yang saat ini dipanggil untuk keperluan perhitungan rata-rata nanti.

            if (gajiSekarang > gajiTertinggi) { // Control untuk mencari karyawan dengan gaji tertinggi, jika gaji karyawan saat ini lebih besar dari gajiTertinggi sebelumnya
                gajiTertinggi = gajiSekarang;   // update gajinya
                namaGajiTertinggi = dKaryawan.getNama(); // Simpan nama gaji tertinggi saat ini
                // System.out.println("Nama dengan Gaji Tertinggi : " + dKaryawan.getNama() + "\n");
            }

        }

        double rataRataRating = totalRating / daftarKaryawan.size(); // perhitungkan rata-rata dengan membagi total rating dengan setiap karyawan yang didaftarkan
        System.out.println("Nama dengan Gaji Tertinggi : " + namaGajiTertinggi);
        System.out.println("Total Anggaran Gaji : " + totalAnggran);
        System.out.println("Rata-Rata Rating Kinerja Seluruh Karyawan : " + rataRataRating);

        
     }
}
