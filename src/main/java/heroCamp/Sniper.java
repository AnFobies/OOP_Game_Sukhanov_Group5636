package heroCamp;

public class Sniper extends BaseHero{

    public Sniper(String name, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, strength, agility, intelligence, endurance, speed);
    }

    public Sniper(String name){
        this("heroCamp.Peasant", 10, 10, 10, 10, 10);
    }

    public void aim(){
        System.out.println(this.characterName + " is aiming the sniper rifle.");
    }

    
    public void shoot(){
        System.out.println(this.characterName + " is shooting the sniper rifle.");
    }
}