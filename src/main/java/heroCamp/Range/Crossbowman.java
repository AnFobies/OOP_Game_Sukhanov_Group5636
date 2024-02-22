package heroCamp.Range;

import heroCamp.BaseHero;

public class Crossbowman extends RangeClass {

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
    }



    public void reload(){
        System.out.println(this.characterName + "is reloading their crossbow.");
    }

    public void fire(){
        System.out.println(this.characterName + "is firing their crossbow.");
    }
}