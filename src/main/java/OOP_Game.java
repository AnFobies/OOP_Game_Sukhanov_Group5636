import heroCamp.*;

public class OOP_Game {
    public static void main(String[] args) {

        // Крестьянин
        Peasant peasant = new Peasant("Olaf", 5, 7, 7, 9, 4);
        // Разбойник
        Rogue rogue = new Rogue("Laskow");
        // Снайпер
        Sniper sniper = new Sniper("Durnan");
        // Колдун
        Warlock warlock = new Warlock("Tristan");
        // Копейщик
        Spearman spearman = new Spearman("Vlad");
        // Арбалетчик
        Crossbowman crossbowman = new Crossbowman("Yuldra");
        // Монах
        Monk monk = new Monk("Mara");

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