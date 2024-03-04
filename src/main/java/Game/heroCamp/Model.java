package Game.heroCamp;

import java.util.ArrayList;

public interface Model {
    String getName();

    int getSpeed();

    int getCurrentHealth();

    int getHealthMax();

    int getEndurance();

    String toString();

    String getInfo();

    BaseHero nearestEnemy (ArrayList<BaseHero> targets);

    void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friends);
}
