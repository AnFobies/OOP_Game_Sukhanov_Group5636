package Game.heroCamp.Mage;

import Game.heroCamp.BaseHero;

import java.util.ArrayList;
import java.util.List;

abstract public class Mages extends BaseHero {

    protected int mana;
    protected int maxMana;
    protected boolean flag;


    protected Mages(String name, int x, int y) {
        super(name, x, y);
        this.speed = 1;
        maxMana = mana = 15;
        flag = false;
    }

    public Mages() {
    }

    public int getSpeed(){
        return speed;
    }

    public void attack(BaseHero target){
        int damage = random.nextInt(5, 15);
        target.GetDamage(-damage);
    }

    public void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friends) {
        if (getCurrentHealth() <= 0)
            return;
        ArrayList<BaseHero> list = new ArrayList<BaseHero>(friends);
        ArrayList<BaseHero> listOfDeads = new ArrayList<BaseHero>();
        int count = 0;
        list.sort((u1, u2) -> u1.getCurrentHealth() - u2.getCurrentHealth());

        for (BaseHero unit : list) {
            if (unit.isDead()) {
                listOfDeads.add(unit);
                count++;
            }
        }
        if (count > 3) {
            flag = true;

        }
        if (flag && mana == maxMana) {
            listOfDeads.sort((u1, u2) -> u2.getSpeed() - u1.getSpeed());
            list.getFirst().setCurrentHealth(healthMax/2);
            mana = 0;
            flag = false;
            return;
        }

        if (flag) {
            mana++;
            return;
        }
        if (mana < 2) {
            mana++;
            return;
        }
        attack(list.getFirst());
        mana -= 2;

    }

    @Override
    public String toString() {return characterName +  ", Hp: " + currentHealth + ", St: " + strength + ", Mana: " + mana;}
}
