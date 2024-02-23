package heroCamp.Range;


import heroCamp.BaseHero;

import java.util.List;

abstract public class RangeClass extends BaseHero {
    protected Integer arrows;

    public Integer getArrows(){
        return arrows;
    }

    public void setArrows(Integer arrows){
        this.arrows = arrows;
    }

    public RangeClass(String name, Integer x, Integer y) {
        super(name, x, y);
        this.speed = 3;
    }

    public void attack(BaseHero target){
        int damage = random.nextInt(5, 10);
        this.arrows--;
        target.takeDamage(damage);
    }

    public void step(List<BaseHero> list) {
        if (!this.die()) {
            if (this.getArrows() >= 1) {
                this.attack(this.nearestEnemy(list));
                System.out.printf("Точно в цель! (Имя: %s, Класс: %s, Здоровье: %d)\n", this.getName(), this.getClass().getSimpleName(), this.getCurrentHealth());
            }else {
                System.out.printf("Мне нужно больше стрел... (Имя: %s, Класс: %s, Здоровье: %d)\n", this.getName(), this.getClass().getSimpleName(), this.getCurrentHealth());
            }
        }
    }

}
