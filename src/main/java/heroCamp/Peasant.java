package heroCamp;

import java.util.Random;

public class Peasant extends BaseHero{
    public Peasant(String name, int strength, int agility, int intelligence, int endurance, int speed){
        super(name, strength, agility, intelligence, endurance, speed);
    }

    public Peasant(String name){
        this("heroCamp.Peasant", 10, 10, 10, 10, 10);
    }


    public void plow(){
        System.out.println(this.characterName + " is plowing the field.");
    }

    public void harvest(){
        System.out.println(this.characterName + " is harvesting the crops.");
    }

    public void instantKill(){
        System.out.println(this.characterName + " can't kill. It's a peasant");
    }

    @Override
    public void attack(BaseHero target) {
        Random random = new Random();
        int chance = random.nextInt(1,  101);
        if (chance == 100){
            target.currentHealth = 0;
            System.out.println(this.characterName + " instantly kills " + target.getCharacterName());
        }
        else{
            int damage = this.strength;
            System.out.println(this.characterName + " attacks " + target.getCharacterName() + " for " + damage + " damage!");
            target.takeDamage(damage);
        }
    }
}