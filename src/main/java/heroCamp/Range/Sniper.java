package heroCamp.Range;

import heroCamp.BaseHero;

public class Sniper extends RangeClass {


    public Sniper(String name, int x, int y) {
        super(name, x, y);
    }

    public void aim() {
        System.out.println(this.characterName + " is aiming the sniper rifle.");
    }


    public void shoot() {
        System.out.println(this.characterName + " is shooting the sniper rifle.");
    }
}