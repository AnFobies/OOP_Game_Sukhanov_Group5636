package Game.heroCamp.Melee;

public class Spearman extends Warriors {

    protected int resistance;

    public Spearman(String name, Integer x, Integer y){
        super(name, x, y);
    }

    public Spearman() {

    }
    @Override
    public void death() {
        if (this.getCurrentHealth() < 1) {
            System.out.println("Как же так...");
        }
    }

    public String getInfo() {
        return "Копейщик";
    }
}
