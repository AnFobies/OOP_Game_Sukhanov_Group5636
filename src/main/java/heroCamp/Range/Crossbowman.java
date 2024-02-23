package heroCamp.Range;

import heroCamp.BaseHero;

import java.util.List;

public class Crossbowman extends RangeClass implements RangeSkill {

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
        this.arrows = 5;
    }



    public void reload(){
        System.out.println(this.characterName + "is reloading their crossbow.");
    }

    public void fire(){
        System.out.println(this.characterName + "is firing their crossbow.");
    }


    @Override
    public String toString(){
        return String.format("Class: %s Name: %s", this.getClass(), getName());
    }
}