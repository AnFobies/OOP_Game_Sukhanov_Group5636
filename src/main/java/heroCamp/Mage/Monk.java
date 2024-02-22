package heroCamp.Mage;

import heroCamp.BaseHero;

public class Monk extends BaseHero {

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Monk(String name, int x, int y, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, x, y, strength, agility, intelligence, endurance, speed);
    }

    public Monk(String name, int x, int y){
        this("heroCamp.Melee.Peasant", x, y, 10, 10, 10, 10, 10);
    }


    public void meditate() {
        System.out.println(this.characterName + " is meditating.");
    }


    public void heal() {
        System.out.println(this.characterName + " is using their healing powers.");
    }
}