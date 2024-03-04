package Game.heroCamp.Mage;

public class Monk extends Mages {

    public Monk(String name, Integer x, Integer y){
        super(name, x, y);
    }

    public Monk() {
        super();
    }

    public String getInfo() {
        return "Монах";
    }

    public void death() {
        if (this.getCurrentHealth() < 1) {
            System.out.println("Бог оставил меня");
        }
    }

}