package heroCamp;

/**
 * Описание объекта персонажа
 */

abstract public class BaseHero {

    protected String characterName;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int endurance;
    protected int currentHealth;
    protected int healthMax;
    protected int speed;

    private int level;

    private int experience;



    /**
     * добавить лвл и опыт
     * @param name - имя персонажа
     * @param strength - характеристика силы
     * @param agility - характеристика ловкости
     * @param intelligence - характеристика интеллекта
     * @param endurance - характеристика выносливости
     * @param currentHealth - показатель здоровья
     * @param healthMax - максимальное значение здоровья
     * @param speed - скорость персонажа, (расстояние, которое он может пройти за ход?)
     */
    private BaseHero(String name, int strength, int agility, int intelligence, int endurance,
                    int currentHealth, int healthMax, int speed) {
        this.characterName = name;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.endurance = endurance;
        this.currentHealth = currentHealth;
        this.healthMax = healthMax;
        this.speed = speed;
    }

    /**
     * нужно переделать создание персонажа, ввести зависимость показателей от характеристик
     * @param name - имя
     * @param strength - сила
     * здоровье думаю убрать отсюда  совсем
     * @param health - здоровье (стартовое?)
     */
    public BaseHero(String name, int strength, int health) {
        this.characterName = name;
        this.strength = strength;
        this.currentHealth = health;
        this.healthMax = health;
    }

    public String getCharacterName(){
        return characterName;
    }

    public int getStrength(){
        return strength;
    }

    public int getAgility(){
        return agility;
    }

    public int getIntelligence(){
        return intelligence;
    }

    public int getEndurance(){
        return endurance;
    }

    public int getCurrentHealth(){
        return currentHealth;
    }

    public int getHealthMax(){
        return healthMax;
    }

    public int getCurrentLevel(){
        return level;
    }

    public int getCurrentExperience(){
        return experience;
    }

    public int speed(){
        return speed;
    }

    public void setCharacterName(String characterName){
        this.characterName = characterName;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public void setAgility(int agility){
        this.agility = agility;
    }

    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public void setEndurance(int endurance){
        this.endurance = endurance;
    }

    public void setCurrentHealth(int currentHealth){
        this.currentHealth = currentHealth;
    }

    public void setHealthMax(int health){
        this.healthMax = health;
    }

    public void speed(int speed){
        this.speed = speed;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public void setExperience(int experience){
        this.experience = experience;
    }

    // Умер
    private void die() {
        setCurrentHealth(0);
    }

    /**
     * нанесение урона
     * @param damage - количество полученного урона
     */
    public void takeDamage(int damage) {
        if (this.currentHealth > damage) {
            this.currentHealth -= damage;
            System.out.println(this.characterName + " take damage -" + damage + "hp" );
        } else {
            this.die();
            System.out.println(this.characterName + " has been defeated!");
        }
    }


    /**
     * физическая атака выбранного персонажа
     * @param target - цель атаки
     */
    public void attack(BaseHero target) {
        int damage = this.strength;
        System.out.println(this.characterName + " attacks " + target.getCharacterName() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }

    /**
     * атака выбранного персонажа заклинанием
     * @param target - цель атаки
     */
    public void attackSpell(BaseHero target) {
        int damage = this.intelligence;
        target.takeDamage(damage);
        System.out.println(this.characterName + " attacks spell" + target.getCharacterName() + " for " + damage + " damage!");
    }


    /**
     *
     * @param heal - количество исцеляемого здоровья
     */
    public void takeHeal(int heal) {
        if (this.healthMax - this.currentHealth != 0) {
            this.currentHealth += heal;
            System.out.println(this.characterName + " take heal:" + heal + "hp" );
        } else {
            System.out.println(this.characterName + " health is already full!");
        }
    }


    /**
     * лечение, написать корректное описание процесса
     * @param target - цель исцеления
     */
    public void heal(BaseHero target) {
        //int heal = this.intelligence;
        int heal = this.strength;
        if(this.currentHealth + heal > this.healthMax)
        {
            System.out.println( target.getCharacterName() + " heals to his maximum health");

        } else {
            System.out.println( target.getCharacterName() + " heals for " + heal + " health points." );
            target.takeHeal(heal);
        }

    }

    public String toString() {
        return String.format("-- %s -- %s[%d/%d], Сила: %d --",
        this.getClass().getName(), this.characterName, this.currentHealth, this.healthMax, this.strength);
    }
}