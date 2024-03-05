package Game.heroCamp.Melee;

import Game.heroCamp.BaseHero;
import Game.gameInterface.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Warriors extends BaseHero {

    protected Position position;

    protected Warriors(String name, int x, int y) {
        super(name, x, y);
        this.speed = 2;
        this.position = new Position(x, y);
    }

    public Warriors() {

    }


    public void attack(BaseHero target){
        int damage = random.nextInt(5,15);
        target.GetDamage(damage);
    }

    public void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friend) {
        if (currentHealth<=0) return;
        BaseHero target = super.nearestEnemy(targets);
        if (position.getDistanse(target.position) < 2){
            attack(nearestEnemy(targets));
            return;
        }
        Position diff = position.getDiff(target.position);

        Position newposition = new Position(position.x, position.y);

        if (Math.abs(diff.x) > Math.abs(diff.y))

            newposition.x += diff.x < 0 ? 1 : -1;
        else
            newposition.y += diff.y < 0 ? 1 : -1;

        for (BaseHero unit : friend) {
            if (unit.position.equals(newposition) && unit.currentHealth > 0) return;

        }
        this.position = newposition;

    }

    @Override
    public String toString() {return characterName +  ", Hp: " + currentHealth + ", St: " + strength;}
}
