import java.util.Random;

public class Peasant extends BaseHero{
    public Peasant( String name, int strength, int health){
        super(name, strength, health);
    }

    public Peasant(){
        super("Peasant", 2, 30);
    }

    public void plow(){
        System.out.println(this.name + " is plowing the field.");
    }

    public void harvest(){
        System.out.println(this.name + " is harvesting the crops.");
    }

    public void instantKill(){
        System.out.println(this.name + " can't kill. It's a peasant");
    }

    @Override
    public void attack(BaseHero target) {
        Random random = new Random();
        int chance = random.nextInt(1,  101);
        if (chance == 100){
            target.health = 0;
            System.out.println(this.name + " instantly kills " + target.getName());
        }
        else{
            int damage = this.strength;
            target.takeDamage(damage);
            System.out.println(this.name + " attacks " + target.getName() + " for " + damage + " damage!");
        }
    }
}