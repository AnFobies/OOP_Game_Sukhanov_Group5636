package Game.gameInterface;

import Game.heroCamp.BaseHero;

import java.util.ArrayList;
import java.util.List;

public interface Step {
    public void step(ArrayList<BaseHero> targets, ArrayList<BaseHero> friends);
}
