package heroCamp;

public class Sniper extends BaseHero {

    /**
     * базовые статы при вводе только имени
     *
     * @param name - имя персонажа
     */
    public Sniper(String name, int x, int y, int strength, int agility, int intelligence, int endurance, int speed) {
        super(name, x, y, strength, agility, intelligence, endurance, speed);
    }

    public Sniper(String name, int x, int y) {
        this("heroCamp.Peasant", x, y, 10, 10, 10, 10, 10);
    }

    public void aim() {
        System.out.println(this.characterName + " is aiming the sniper rifle.");
    }


    public void shoot() {
        System.out.println(this.characterName + " is shooting the sniper rifle.");
    }
}