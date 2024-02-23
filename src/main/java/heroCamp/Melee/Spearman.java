package heroCamp.Melee;

import heroCamp.BaseHero;

public class Spearman extends Warriors {

    protected int resistance;

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Spearman(String name, Integer x, Integer y){
        super(name, x, y);
    }


    public void pierce(){
        System.out.println(this.characterName + " is piercing with their spear.");
    }


    public void hooking() {
        System.out.println(this.characterName + " cuts with his spear.");
    }

    @Override
    public String toString(){
        return String.format("Class: %s Name: %s", this.getClass(), getName());
    }
}
