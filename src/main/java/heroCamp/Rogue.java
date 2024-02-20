package heroCamp;

public class Rogue extends BaseHero{

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Rogue(String name, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, strength, agility, intelligence, endurance, speed);
    }

    public Rogue(String name){
        this("heroCamp.Peasant", 10, 10, 10, 10, 10);
    }
    public void pickPocket(){
        System.out.println(this.characterName + " is picking pockets.");
    }

    public void stealth(){
        System.out.println("No one sees " + this.characterName);
    }
}