package heroCamp;

public class Monk extends BaseHero{

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Monk(String name, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, strength, agility, intelligence, endurance, speed);
    }

    public Monk(String name){
        this("heroCamp.Peasant", 10, 10, 10, 10, 10);
    }


    public void meditate() {
        System.out.println(this.characterName + " is meditating.");
    }


    public void heal() {
        System.out.println(this.characterName + " is using their healing powers.");
    }
}