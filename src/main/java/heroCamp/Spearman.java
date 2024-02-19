package heroCamp;

public class Spearman extends BaseHero {
    public Spearman(String name, int strength, int health){
        super(name, strength, health);
    }

    
    public Spearman(){
        super("heroCamp.Spearman", 7, 30);
    }


    public void pierce(){
        System.out.println(this.characterName + " is piercing with their spear.");
    }


    public void hooking() {
        System.out.println(this.characterName + " cuts with his spear.");
    }
}
