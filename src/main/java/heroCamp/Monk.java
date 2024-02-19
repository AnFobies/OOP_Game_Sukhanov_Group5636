package heroCamp;

public class Monk extends BaseHero{
    public Monk(String name, int strength, int health) {
        super(name, strength, health);
    }


    public Monk() {
        super("heroCamp.Monk", 6, 30);
    }


    public void meditate() {
        System.out.println(this.characterName + " is meditating.");
    }


    public void heal() {
        System.out.println(this.characterName + " is using their healing powers.");
    }
}