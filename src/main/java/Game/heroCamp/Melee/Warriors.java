package Game.heroCamp.Melee;

import Game.gameInterface.Position;
import Game.heroCamp.BaseHero;

import java.util.ArrayList;

public abstract class Warriors extends BaseHero {

    protected Warriors(String name, int x, int y) {
        super(name, x, y);
        this.speed = 2;
        this.position = new Position(x, y);
    }

    public Warriors() {

    }


    public void attack(BaseHero target){
        if (target == null) {
            return;
        }
        int damage = random.nextInt(5,15);
        target.GetDamage(damage);
    }

    public void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friend) {
        if (currentHealth<=0) return;
        BaseHero target = super.nearestEnemy(targets);
        if (position.getDistanse(target.position) < 2 && !targets.isEmpty()){
            attack(target);
            return;
        }
        Position diff = position.getDiff(target.position);
        if (Math.abs(diff.x) > Math.abs(diff.y)){
            this.position.x += diff.x < 0? 1: -1;
        } else {
            this.position.y += diff.y < 0? 1: -1;
        }

    }

    @Override
    public String toString() {return characterName +  ", Hp: " + currentHealth + ", St: " + strength + " " + position.getX() + " " + position.getY();}
}
