package Game.heroCamp.Mage;

public class Warlock extends Mages {

    public Warlock(String name, Integer x, Integer y) {
        super(name, x, y);
    }

    public Warlock() {
    }

    public String getInfo() {
        return "Чернокнижник";
    }

    public void death() {
        if (this.getCurrentHealth() < 1) {
            System.out.println("Бегите, глупцы!..");
        }
    }
}