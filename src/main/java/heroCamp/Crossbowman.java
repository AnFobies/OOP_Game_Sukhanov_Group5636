package heroCamp;

public class Crossbowman extends BaseHero{

    public Crossbowman(String name, int x, int y, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, x, y, strength, agility, intelligence, endurance, speed);
    }

    /**
     * Базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Crossbowman(String name, int x, int y){
        this("heroCamp.Peasant", x, y, 10, 10, 10, 10, 10);
    }

    public void reload(){
        System.out.println(this.characterName + "is reloading their crossbow.");
    }

    public void fire(){
        System.out.println(this.characterName + "is firing their crossbow.");
    }
}