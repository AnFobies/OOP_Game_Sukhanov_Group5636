package heroCamp;

public class Warlock extends BaseHero{

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Warlock(String name, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, strength, agility, intelligence, endurance, speed);
    }

    public Warlock(String name){
        this("heroCamp.Peasant", 10, 10, 10, 10, 10);
    }

    public void curse(){
        System.out.println(this.characterName + " is cursing the enemy.");
    }

    public void summonDemon(){
        System.out.println(this.characterName + " is summoning a demon.");
    }
}