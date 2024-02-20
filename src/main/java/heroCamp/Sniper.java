package heroCamp;

public class Sniper extends BaseHero{
    public Sniper(String name, int strength, int health){
        super(name, strength, health);
    }

    public Sniper(){
        super("heroCamp.Sniper", 5, 30);
    }

    public void aim(){
        System.out.println(this.characterName + " is aiming the sniper rifle.");
    }

    
    public void shoot(){
        System.out.println(this.characterName + " is shooting the sniper rifle.");
    }
}