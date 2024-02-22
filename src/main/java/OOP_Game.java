import heroCamp.*;
import heroCamp.Mage.Monk;
import heroCamp.Mage.Warlock;
import heroCamp.Melee.Peasant;
import heroCamp.Melee.Rogue;
import heroCamp.Melee.Spearman;
import heroCamp.Range.Crossbowman;
import heroCamp.Range.Sniper;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OOP_Game {
    public static void main(String[] args) {

        // Создаем команды и отправляем их бить друг друга

        List<BaseHero> team_one = generateHeroesTeamOne(10);
        List<BaseHero> team_two = generateHeroesTeamTwo(10);

        for (BaseHero unit : team_one) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();
        for (BaseHero unit : team_two) {
            System.out.printf("Имя: %s, Класс: %s, Координаты: %d,%d\n", unit.getName(), unit.getClass().getSimpleName(), unit.position.getX(), unit.position.getY());
        }
        System.out.println();
    }

    public static List<BaseHero> generateHeroesTeamOne(int count) {
        List<BaseHero> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list.add(new Peasant(getName(), i, 0));
                    break;
                case 1:
                    list.add(new Rogue(getName(), i, 0));
                    break;
                case 2:
                    list.add(new Sniper(getName(), i, 0));
                    break;
                case 3:
                    list.add(new Warlock(getName(), i, 0));
                    break;
                case 4:
                    list.add(new Spearman(getName(), i, 0));
                    break;
                case 5:
                    list.add(new Crossbowman(getName(), i, 0));
                    break;
                case 6:
                    list.add(new Monk(getName(), i, 0));
                    break;
            }
        }
        return list;
    }

    public static List<BaseHero> generateHeroesTeamTwo(int count) {
        List<BaseHero> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list.add(new Peasant(getName(), i, 9));
                    break;
                case 1:
                    list.add(new Rogue(getName(), i, 9));
                    break;
                case 2:
                    list.add(new Sniper(getName(), i, 9));
                    break;
                case 3:
                    list.add(new Warlock(getName(), i, 9));
                    break;
                case 4:
                    list.add(new Spearman(getName(), i, 9));
                    break;
                case 5:
                    list.add(new Crossbowman(getName(), i, 9));
                    break;
                case 6:
                    list.add(new Monk(getName(), i, 9));
                    break;
            }
        }
        return list;
    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}