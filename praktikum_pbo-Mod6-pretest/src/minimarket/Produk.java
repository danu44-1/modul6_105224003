package minimarket;

public class Produk {
    String namaProduk;
    double harga;

    Produk(String namaProd, double harga) {
        this.namaProduk = namaProd;
        this.harga = harga;
    }

    public void tampilkanDetail(){
        System.out.println("Nama produk : " + this.namaProduk);
        System.out.println("Harga produk : " + this.harga);
    }
}
