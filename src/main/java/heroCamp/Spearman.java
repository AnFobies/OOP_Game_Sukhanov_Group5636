package heroCamp;

public class Spearman extends BaseHero {

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Spearman(String name, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, strength, agility, intelligence, endurance, speed);
    }

    public Spearman(String name){
        this("heroCamp.Peasant", 10, 10, 10, 10, 10);
    }


    public void pierce(){
        System.out.println(this.characterName + " is piercing with their spear.");
    }


    public void hooking() {
        System.out.println(this.characterName + " cuts with his spear.");
    }
}
