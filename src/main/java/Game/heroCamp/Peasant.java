package Game.heroCamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Peasant extends BaseHero {

    int arrow;
    public boolean flag;

    public Peasant(String name, Integer x, Integer y){
        super(name, x, y);
        this.speed = 0;
        this.arrow = 5;
        this.flag = false;
    }

    public Peasant() {

    }

    public void setArrow(int arrow) {
        this.arrow = arrow;
    }

    public int getArrow() {
        return arrow;
    }

    public String getInfo() {
        return "Фермер";
    }

    @Override
    public String toString() {return characterName +  ", Hp: " + currentHealth + ", St: " + strength;}


    @Override
    public void death() {
        if (this.getCurrentHealth() < 1) {
            System.out.println("Ну вот, меня убили...");
        }
    }

    public void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friends) {

        if (getCurrentHealth() <= 0) return;
        flag = false;

    }
}