import heroCamp.*;
import heroCamp.Mage.*;
import heroCamp.Melee.*;
import heroCamp.Range.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OOP_Game {
    public static void main(String[] args) {

        // Создаем команды и отправляем их бить друг друга

        List<BaseHero> team_one = new ArrayList<>(teamCreator(0));
        List<BaseHero> team_two = new ArrayList<>(teamCreator(9));

        for (BaseHero unit : team_one) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();
        for (BaseHero unit : team_two) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();

        ArrayList<BaseHero> all = new ArrayList<>();
        all.addAll(team_one);
        all.addAll(team_two);

        all.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());

        System.out.println("-".repeat(56));

        for (BaseHero element : all) {
            if (team_one.contains(element)) {
                element.step(team_two, team_one);
            } else element.step(team_one, team_two);
        }

        for (BaseHero unit : all) {
            System.out.printf("Имя: %s, Здоровье: %d, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getCurrentHealth(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();

        all.get(0).nearestEnemy(team_two);

    }

    private static ArrayList<BaseHero> teamCreator(int y){
        ArrayList<BaseHero> team = new ArrayList<>();
        int teamCount = 10;
        for (int i = 0; i < teamCount; i++) {
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