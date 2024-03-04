package Game.heroCamp.Range;

public class Crossbowman extends RangeClass {

    public Crossbowman(String name, int x, int y){
        super(name, x, y);
        this.maxArrows = arrows = 30;
    }

    public Crossbowman() {
        super();
    }


    public String getInfo() {
        return "Арбалетчик";
    }

    @Override
    public void death() {
        if (this.getCurrentHealth() < 1) {
            System.out.println("Мой арбалет сломан");
        }
    }
}