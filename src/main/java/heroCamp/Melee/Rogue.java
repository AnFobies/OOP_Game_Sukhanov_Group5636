package heroCamp.Melee;

import heroCamp.BaseHero;

public class Rogue extends Warriors {

    protected int fortune;

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

    @Override
    public String toString(){
        return String.format("Class: %s Name: %s", this.getClass(), getName());
    }
}