package heroCamp.Mage;

import heroCamp.BaseHero;

public class Monk extends Mages {

    protected int faith;

    /**
     * базовые статы при вводе только имени
     * @param name - имя персонажа
     */
    public Monk(String name, Integer x, Integer y){
        super(name, x, y);
    }

    @Override
    public String toString(){
        return String.format("Class: %s Name: %s", this.getClass(), getName());
    }

    public void toHeal (BaseHero target){
        int heal = BaseHero.random.nextInt(5, 16);
        while (target.getCurrentHealth() < target.getHealthMax()){
            target.takeHeal(heal);
            faith -= heal/2;
            if (target.getCurrentHealth() == target.getHealthMax()){
                break;
            }
        }
    }


    public void meditate() {
        System.out.println(this.characterName + " is meditating.");
    }


    public void heal() {
        System.out.println(this.characterName + " is using their healing powers.");
    }
}