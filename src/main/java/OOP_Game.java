import heroCamp.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OOP_Game {
    public static void main(String[] args) {

        // Создаем команды и отправляем их бить друг друга

        List<BaseHero> team_one = generateHeroesTeamOne(10);
        List<BaseHero> team_two = generateHeroesTeamTwo(10);
        System.out.println("\nКоманда один:");
        team_one.forEach(u -> System.out.println(u.getInfo()));

        System.out.println("\nКоманда два:");
        team_two.forEach(u -> System.out.println(u.getInfo()));
        System.out.println();
    }

    public static List<BaseHero> generateHeroesTeamOne(int count) {
        List<BaseHero> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list.add(new Peasant("Olaf", i, 0));
                    break;
                case 1:
                    list.add(new Rogue("Laskow", i, 0));
                    break;
                case 2:
                    list.add(new Sniper("Durnan", i, 0));
                    break;
                case 3:
                    list.add(new Warlock("Tristan", i, 0));
                    break;
                case 4:
                    list.add(new Spearman("Vlad", i, 0));
                    break;
                case 5:
                    list.add(new Crossbowman("Yuldra", i, 0));
                    break;
                case 6:
                    list.add(new Monk("Mara", i, 0));
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
                    list.add(new Peasant("Olaf", i, 9));
                    break;
                case 1:
                    list.add(new Rogue("Laskow", i, 9));
                    break;
                case 2:
                    list.add(new Sniper("Durnan", i, 9));
                    break;
                case 3:
                    list.add(new Warlock("Tristan", i, 9));
                    break;
                case 4:
                    list.add(new Spearman("Vlad", i, 9));
                    break;
                case 5:
                    list.add(new Crossbowman("Yuldra", i, 9));
                    break;
                case 6:
                    list.add(new Monk("Mara", i, 9));
                    break;
            }
        }
        return list;
    }

    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}