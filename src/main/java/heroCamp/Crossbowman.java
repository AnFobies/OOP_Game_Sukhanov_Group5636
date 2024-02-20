package heroCamp;

public class Crossbowman extends BaseHero{
    public Crossbowman(String name, int strength, int health){
        super(name, strength, health);
    }

    public Crossbowman(){
        super("heroCamp.Crossbowman", 7, 30);
    }

    public void reload(){
        System.out.println(this.characterName + "is reloading their crossbow.");
    }

    public void fire(){
        System.out.println(this.characterName + "is firing their crossbow.");
    }
}