package Game.heroCamp.Range;

public class Sniper extends RangeClass {


    public Sniper(String name, int x, int y) {
        super(name, x, y);
        this.maxArrows = arrows = 100;
    }

    public Sniper() {

    }

    public String getInfo() {
        return "Снайпер";
    }

    @Override
    public void death() {
        if (this.getCurrentHealth() < 1) {
            System.out.println("Тетива порвана...");
        }
    }

}