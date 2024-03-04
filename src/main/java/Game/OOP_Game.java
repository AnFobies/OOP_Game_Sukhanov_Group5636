package Game;

import Game.gameInterface.Names;
import Game.heroCamp.*;
import Game.heroCamp.Mage.*;
import Game.heroCamp.Melee.*;
import Game.heroCamp.Range.*;
import Game.cc.*;

import java.util.ArrayList;
import java.util.Random;

public class OOP_Game {

    public static ArrayList<BaseHero> holyTeam = new ArrayList<BaseHero>(teamCreator(1));
    public static ArrayList<BaseHero> darkTeam = new ArrayList<BaseHero>(teamCreator(10));
    public static ArrayList<BaseHero> allTeam = new ArrayList<BaseHero>();

    public static void main(String[] args) {

        Presenter myPresenter = new Presenter(new View(), new Crossbowman(), new Sniper(),
                new Rogue(), new Spearman(), new Peasant(),
                new Monk(), new Warlock(), holyTeam, darkTeam, allTeam);

        myPresenter.startGame();


    }

    private static ArrayList<BaseHero> teamCreator(int y){
        ArrayList<BaseHero> team = new ArrayList<>();
        int teamCount = 10;
        for (int i = 1; i < teamCount+1; i++) {
            switch (new Random().nextInt(1, 8)) {
                case 1:
                    team.add(new Monk(getName(), i, y));
                    break;
                case 2:
                    team.add(new Warlock(getName(), i, y));
                    break;
                case 3:
                    team.add(new Crossbowman(getName(), i, y));
                    break;
                case 4:
                    team.add(new Sniper(getName(), i, y));
                    break;
                case 5:
                    team.add(new Peasant(getName(), i, y));
                    break;
                case 6:
                    team.add(new Rogue(getName(), i, y));
                    break;
                case 7:
                    team.add(new Spearman(getName(), i, y));
                    break;
            }
        }
        return team;
    }


    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}