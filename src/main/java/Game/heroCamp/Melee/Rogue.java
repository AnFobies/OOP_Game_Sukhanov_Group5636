package Game.heroCamp.Melee;

public class Rogue extends Warriors {

    protected int fortune;

    public Rogue(String name, Integer x, Integer y){
        super(name, x, y);
    }

    public Rogue() {
        super();
    }

    @Override
    public void death() {
        if (this.getCurrentHealth() < 1) {
            System.out.println("Тени, примите меня");
        }
    }

    public String getInfo() {
        return "Разбойник";
    }
}