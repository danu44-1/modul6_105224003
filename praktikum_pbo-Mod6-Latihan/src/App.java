import game.*;


public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

       Hero hero1 = new HeroStrength("Danu", 100.0, 50.0);
       Hero hero2 = new HeroStrength("Dimas", 100.0, 50.0);

        hero1.display();
        hero2.display();

        hero1.berlatih();
        hero2.berlatih();

        hero1.terimaSerangan(50);
        hero2.terimaSerangan(50);

        hero1.display();
        hero2.display();
    }
}
