package heroCamp.Range;

import heroCamp.BaseHero;

import java.util.List;

public class Sniper extends RangeClass implements RangeSkill {


    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.arrows = 5;
    }

    public void aim() {
        System.out.println(this.characterName + " is aiming the sniper rifle.");
    }


    public void shoot() {
        System.out.println(this.characterName + " is shooting the sniper rifle.");
    }

    @Override
    public String toString(){
        return String.format("Class: %s Name: %s", this.getClass(), getName());
    }

}