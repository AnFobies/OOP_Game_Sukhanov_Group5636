package heroCamp.Melee;

import heroCamp.BaseHero;
import heroCamp.Position;

import java.util.List;

public abstract class Warriors extends BaseHero implements MeleeSkills {

    protected int anger;
    protected Position position;

    protected Warriors(String name, int x, int y) {
        super(name, x, y);
        this.anger = 30;
        this.speed = 2;
        this.position = new Position(x, y);
    }

    public void attack(BaseHero target){
        int damage = random.nextInt(5,15);
        this.anger--;
        target.takeDamage(damage);
    }

    public void step(List<BaseHero> targets, List<BaseHero> friends){
        if(isDead()) return;
        BaseHero unit = nearestEnemy(targets);
        if (position.getDistanse(unit) < 2){
            attack(unit);
            return;
        }
        Position diff = this.position.getDiff(unit.position);
        Position currentPos = new Position(position.getX(), position.getY());
        if(Math.abs(diff.getX()) > Math.abs(diff.getY())){
            position.setX(position.getX() + diff.getX() > 0 ? 1 : -1);
            System.out.println(characterName + "делает шаг");
        } else position.setY(position.getY() + diff.getY() > 0 ? 1 : -1);
        System.out.println(characterName + "делает шаг");

        friends.forEach(n -> {
            if (n.position.equals(position)){
                this.position = currentPos;
            }
        });
    }
}
