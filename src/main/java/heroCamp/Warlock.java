package heroCamp;

public class Warlock extends BaseHero{
    public Warlock(String name, int strength, int health){
        super(name, strength, health);
    }

    public Warlock(){
        super("heroCamp.Warlock", 4, 30);
    }

    public void curse(){
        System.out.println(this.name + " is cursing the enemy.");
    }

    public void summonDemon(){
        System.out.println(this.name + " is summoning a demon.");
    }
}