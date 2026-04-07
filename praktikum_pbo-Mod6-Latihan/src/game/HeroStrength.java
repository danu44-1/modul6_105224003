package game;

public class HeroStrength extends Hero{
    String khusus = "Strength";

    // public String getKhusus() {
    //     return khusus;
    // }

    // public void setKhusus(String khusus) {
    //     this.khusus = khusus;
    // }

    public HeroStrength(String nama, double health, double attackPower) {
        super(nama, health, attackPower);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Tipe : " + khusus + "\n");
    }

    @Override
    public void terimaSerangan(double damage) {
        super.terimaSerangan(damage * 0.5);
        System.out.println("Karakter terkena : " + damage);
    }

}
