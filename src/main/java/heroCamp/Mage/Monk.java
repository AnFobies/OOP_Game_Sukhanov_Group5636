package heroCamp.Mage;

import heroCamp.BaseHero;

public class Monk extends BaseHero {

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Monk(String name, Integer x, Integer y){
        super(name, x, y);
    }


    public void meditate() {
        System.out.println(this.characterName + " is meditating.");
    }


    public void heal() {
        System.out.println(this.characterName + " is using their healing powers.");
    }
}