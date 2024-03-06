package Game.heroCamp.Range;


import Game.heroCamp.BaseHero;

import java.util.ArrayList;
import Game.heroCamp.Peasant;

abstract public class RangeClass extends BaseHero {
    protected int arrows;
    protected int maxArrows;

    public RangeClass() {

    }

    public RangeClass(String name, Integer x, Integer y) {
        super(name, x, y);
        this.speed = 3;
    }

    public Integer getArrows(){
        return arrows;
    }

    public void setArrows(Integer arrows){
        this.arrows = arrows;
    }



    public void attack(BaseHero target){
        int damage = random.nextInt(5, 15);
        this.arrows--;
        target.GetDamage(damage);
    }

    @Override
    public String toString() {return characterName +  ", Hp: " + currentHealth + ", St: " + strength + ", Arrows: " + arrows;}

    public void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friends) {

        if (getCurrentHealth() <= 0 || getArrows() <= 0) return;
        attack(nearestEnemy(targets));
        //System.out.printf("%s %s %s %s\n", name, getClass().getSimpleName(), "Стреляю в", nearestEnemy(targets).getName());
        if (getArrows() < maxArrows){

            for (BaseHero unit : friends) {
                if (unit.getInfo().equals("Крестьянин") && !((Peasant)unit).flag) {
                    ((Peasant)unit).flag = true;
                    arrows++;
                    return;
                }
            }
        }
    }

}
