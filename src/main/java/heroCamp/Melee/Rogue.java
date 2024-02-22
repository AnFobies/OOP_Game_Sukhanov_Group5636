package heroCamp.Melee;

import heroCamp.BaseHero;

public class Rogue extends BaseHero {

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Rogue(String name, Integer x, Integer y){
        super(name, x, y);
    }

    public void pickPocket(){
        System.out.println(this.characterName + " is picking pockets.");
    }

    public void stealth(){
        System.out.println("No one sees " + this.characterName);
    }
}