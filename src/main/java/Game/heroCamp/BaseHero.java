package Game.heroCamp;

import Game.gameInterface.Position;
import Game.gameInterface.Step;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Описание объекта персонажа
 */

public abstract class BaseHero implements Step, Model {

    public Position position;

    protected static Random random;

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

    protected Boolean status;

    public ArrayList<BaseHero> units;

    static {BaseHero.random = new Random();}


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

    protected BaseHero() {
    }

    public String getCharacterName(){
        return characterName;
    }

    public String getName(){
        return this.characterName;
    }

    public int getSpeed(){
        return speed;
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

    public void setCurrentHealth(int currentHealth){
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

    public String toString() {
        return String.format("-- %s -- %s[%d/%d], Сила: %d --",
                this.getClass().getName(), this.characterName, this.currentHealth, this.healthMax, this.strength);
    }

    public Boolean getStatus(){
        return status;
    }


    public void GetDamage(int damage) {
        currentHealth -= damage;
        if (currentHealth < 0) {
            currentHealth = 0;
            death();
        }
        if (currentHealth >= getHealthMax()) currentHealth = healthMax;
    }

    public void death(){
        if (getCurrentHealth() < 1) {
            System.out.println("Ваш персонаж мертв");
        }
    }

    public String getInfo() {return " ";}

//    public BaseHero nearestEnemy (ArrayList<BaseHero> targets) {
//        BaseHero target = null;
//        double minDistance = Double.MAX_VALUE;
//        for (BaseHero hero : targets) {
//            if (position.getDistanse(hero.position) < minDistance && !hero.isDead()) {
//                minDistance = position.getDistanse(hero.position);
//                target = hero;
//            }
//        }
//        return target;
//    }

    public BaseHero nearestEnemy(ArrayList<BaseHero> targets) {
        if (targets.isEmpty()) {
            return null; // Handle empty list case
        }

        BaseHero nearest = null;
        double minDistance = Double.MAX_VALUE;

        for (BaseHero hero : targets) {
            double distance = position.getDistanse(hero.position);
            if (distance < minDistance && hero.currentHealth > 0) {
                minDistance = distance;
                nearest = hero;
            }
        }

        return nearest;
    }

    public boolean isDead(){
        if (getCurrentHealth() <= 0) {
            return true;
        }
        return false;
    }



}
