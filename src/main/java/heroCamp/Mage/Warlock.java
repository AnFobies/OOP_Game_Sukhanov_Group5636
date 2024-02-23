package heroCamp.Mage;

import heroCamp.BaseHero;

public class Warlock extends Mages implements MageAttack {

    /**
     * Базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Warlock(String name, Integer x, Integer y){
        super(name, x, y);
    }

    @Override
    public String toString(){
        return String.format("Class: %s Name: %s", this.getClass(), getName());
    }

    public void curse(){
        System.out.println(this.characterName + " is cursing the enemy.");
    }

    public void summonDemon(){
        System.out.println(this.characterName + " is summoning a demon.");
    }
}