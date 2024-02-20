import heroCamp.*;

public class OOP_Game {
    public static void main(String[] args) {

        // Крестьянин
        Peasant peasant = new Peasant("Olaf", 2, 20);
        // Разбойник
        Rogue rogue = new Rogue("Laskow", 8, 40);
        // Снайпер
        Sniper sniper = new Sniper("Durnan", 4, 30);
        // Колдун
        Warlock warlock = new Warlock("Tristan", 6, 80);
        // Копейщик
        Spearman spearman = new Spearman("Vlad", 7, 30);
        // Арбалетчик
        Crossbowman crossbowman = new Crossbowman("Yuldra", 2, 40);
        // Монах
        Monk monk = new Monk("Mara", 5, 70);

        //Используется каждый созданный персонаж
       System.out.println(  );
        peasant.attack(rogue);
        rogue.attack(spearman);
        rogue.attack(spearman);
        rogue.attack(spearman);
        rogue.attack(spearman);
        sniper.aim();
        warlock.heal(warlock);
        warlock.attackSpell(peasant);
        crossbowman.attack(monk);
        crossbowman.reload();
        spearman.pierce();
        monk.heal(rogue);
        monk.heal();



        System.out.println( "\n" + peasant );
        System.out.println( rogue );
        System.out.println( sniper );
        System.out.println( warlock );
        System.out.println( crossbowman );
        System.out.println( spearman );
        System.out.println( monk + "\n" );
    }
}