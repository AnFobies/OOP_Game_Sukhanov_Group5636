package heroCamp.Mage;

import heroCamp.BaseHero;

public class Warlock extends BaseHero {

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Warlock(String name, Integer x, Integer y){
        super(name, x, y);
    }

    public void curse(){
        System.out.println(this.characterName + " is cursing the enemy.");
    }

    public void summonDemon(){
        System.out.println(this.characterName + " is summoning a demon.");
    }
}