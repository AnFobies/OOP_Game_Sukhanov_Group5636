package heroCamp.Mage;

import heroCamp.BaseHero;

import java.util.List;

abstract public class Mages extends BaseHero implements MageAttack {
    protected Mages(String name, int x, int y) {
        super(name, x, y);
        this.speed = 1;
    }

    public int getSpeed(){
        return speed;
    }

    public void attack(BaseHero target){
        int damage = random.nextInt(5, 15);
        target.takeDamage(damage);
    }

    public void step(List<BaseHero> list, List<BaseHero> friends){

    }
}
