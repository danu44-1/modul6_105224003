package game;

public class Hero {
    private String nama;
    private double health;
    private double attackPower;

    Hero(String nama, double health, double attackPower){
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public String getNama() {
        return nama;
    }

    public double getHealth() {
        return health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public void display() {
        System.out.println("Nama : " + this.nama);
        System.out.println("Health : " + this.health);
        System.out.println("Attack Pow : " + this.attackPower);
    }

    public void berlatih() {
        this.attackPower += 10;
        System.out.println(this.nama + " Sedang berlatih");
    }

    public void terimaSerangan(double damage) {
        this.health -= damage;
        System.out.println("Menerima damage sebesar : " + damage);
    }
}
