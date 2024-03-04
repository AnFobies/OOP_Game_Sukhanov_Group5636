package Game.heroCamp.Melee;

import Game.heroCamp.BaseHero;
import Game.gameInterface.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Warriors extends BaseHero {

    protected int anger;
    protected Position position;

    protected Warriors(String name, int x, int y) {
        super(name, x, y);
        this.anger = 30;
        this.speed = 2;
        this.position = new Position(x, y);
    }

    public Warriors() {

    }

    public void setAnger(int anger) {this.anger = anger;}

    public int getAnger() {return anger;}

    public void attack(BaseHero target){
        int damage = random.nextInt(5,15);
        this.anger--;
        target.GetDamage(damage);
    }

    public void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friends) {

        if (getCurrentHealth() < 0) return;
        BaseHero unit = nearestEnemy(targets);
        if (position.getDistanse(unit.position) < 2 && getAnger() > 0) {
            attack(unit);
            return;
        }
        Position diff = this.position.getDiff(unit.position);
        Position currentPos = new Position(position.getX(), position.getY());
        if (Math.abs(diff.getX()) <  Math.abs(diff.getY())){
            position.setX(position.getX() + (diff.getX() < 0 ? 1 : -1));
        } else position.setY(position.getY() + (diff.getY() < 0 ? 1 : -1));
        boolean flag = false;
        for (BaseHero n : friends) {
            if (n.position.equals(position) && n.getCurrentHealth() > 0) {
                flag = true;
                break;
            }
        }
        if (flag) position = currentPos;


    }

    @Override
    public String toString() {return characterName +  ", Hp: " + currentHealth + ", St: " + strength + ", Anger: " + anger;}
}
