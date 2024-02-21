package heroCamp;

public interface BaseHeroInterface {
    // Шаг куда-нибудь
    public default void step(){
        System.out.println(getName() + " прошел немного");
    }

    // Шаг в конкретном направлении
    public default void step(String direction){
        System.out.println(getName() + " прошел " + direction + "немного");
    }
    public default void stepUp(){
        this.step("вперед");
    }
    public default void stepDown(){
        this.step("назад");
    }
    public default void stepLeft(){
        this.step("влево");
    }
    public default void stepRight(){
        this.step("вправо");
    }

    // Вывод в строке
    public default String getInfo(){
        return getClass().getName();
    }

    public default String getName(){
        return "";
    }
}
