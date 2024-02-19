package heroCamp;

public class Rogue extends BaseHero{
    public Rogue(String name, int strength, int health){
        super(name, strength, health);
    }

    public Rogue(){
        super("heroCamp.Rogue", 6, 30);
    }

    public void pickPocket(){
        System.out.println(this.name + " is picking pockets.");
    }

    public void stealth(){
        System.out.println("No one sees " + this.name);
    }
}