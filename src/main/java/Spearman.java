public class Spearman extends BaseHero {
    public Spearman(String name, int strength, int health){
        super(name, strength, health);
    }

    
    public Spearman(){
        super("Spearman", 7, 30);
    }


    public void pierce(){
        System.out.println(this.name + " is piercing with their spear.");
    }


    public void hooking() {
        System.out.println(this.name + " cuts with his spear.");
    }
}
