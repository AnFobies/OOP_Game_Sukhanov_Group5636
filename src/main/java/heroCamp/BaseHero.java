package heroCamp;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * Описание объекта персонажа
 */

abstract public class BaseHero implements BaseHeroInterface {

    public Position position;

    protected static Random r;

    protected String characterName;
    protected int strength;
    protected int agility;
    protected int intelligence;
    protected int endurance;
    public int currentHealth;
    protected int healthMax;
    protected int speed;

    protected int level;

    protected int experience;



    /**
     * добавить лвл и опыт
     * @param name - имя персонажа
     * @param strength - характеристика силы
     * @param agility - характеристика ловкости
     * @param intelligence - характеристика интеллекта
     * @param endurance - характеристика выносливости
     * currentHealth - показатель здоровья
     * healthMax - максимальное значение здоровья
     * @param speed - скорость персонажа, (расстояние, которое он может пройти за ход?)
     */

    protected BaseHero(String name, int x, int y, int strength, int agility, int intelligence, int endurance, int speed) {
            this.characterName = name;
            position = new Position(x, y);
            this.strength = strength;
            this.agility = agility;
            this.intelligence = intelligence;
            this.endurance = endurance;
            this.healthMax = endurance * 10;
            this.currentHealth = healthMax;
            this.speed = speed;
    }

    /**
     * Нужно переделать создание персонажа, ввести зависимость показателей от характеристик
     * @param name - имя
     * базовые параметры при создании персонажа с вводом только имени
     */
    protected BaseHero(String name, int x, int y)
    {
        this(name, x, y, 10, 10, 10, 10, 10);
    }

    public String getCharacterName(){
        return characterName;
    }

    public String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
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

    private void setStrength(int strength){
        this.strength = strength;
    }

    private void setAgility(int agility){
        this.agility = agility;
    }

    private void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }

    private void setEndurance(int endurance){
        this.endurance = endurance;
    }

    private void setCurrentHealth(int currentHealth){
        this.currentHealth = currentHealth;
    }

    private void setHealthMax(int health){
        this.healthMax = health;
    }

    private void setSpeed(int speed){
        this.speed = speed;
    }

    private void setLevel(int level){
        this.level = level;
    }

    private void setExperience(int experience){
        this.experience = experience;
    }

    // Умер
    protected boolean die() {
        if (this.getCurrentHealth() <= 0) {
            return false;
        }
        return true;
    }

    public BaseHero nearestEnemy (List<BaseHero> targets) {
        Queue<BaseHero> target = new LinkedList<>();
        double minDistance = 10;
        for (BaseHero hero : targets) {
            if (position.getDistanse(hero) < minDistance) {
                minDistance = position.getDistanse(hero);
                target.add(hero);
            }
        }
        return target.peek();
    }

    /**
     * Нанесение урона
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
     * Физическая атака выбранного персонажа
     * @param target - цель атаки
     */
    public void attack(BaseHero target) {
        int damage = this.strength;
        System.out.println(this.characterName + " attacks " + target.getCharacterName() + " for " + damage + " damage!");
        target.takeDamage(damage);
    }

    /**
     * Атака выбранного персонажа заклинанием
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
        if (this.healthMax > this.currentHealth){
            this.currentHealth += heal;
            if(this.currentHealth > this.healthMax){
                this.currentHealth = this.healthMax;
            }
            System.out.println(this.characterName + " take heal:" + heal + "hp" );
        } else {
            System.out.println(this.characterName + " health is already full!");
        }
    }


    /**
     * Лечение, написать корректное описание процесса
     * @param target - цель исцеления
     */
    public void heal(BaseHero target) {
        //int heal = this.intelligence;
        int heal = this.strength;
        System.out.println(this.characterName + " heal " + target.getCharacterName() + " for " + heal + " health points!");
        target.takeHeal(heal);
    }

    public String toString() {
        return String.format("-- %s -- %s[%d/%d], Сила: %d --",
        this.getClass().getName(), this.characterName, this.currentHealth, this.healthMax, this.strength);
    }
}
