package heroCamp;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Position {
    protected Integer x, y;

    public Position(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public List<Integer> getPosition() {
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    /**
     * Param Position - координаты персонажа
     *
     * @return - Возвращает расстояние до цели
     */

    public Double getDistanse(BaseHero target) {
        double targetDistanse = 0;
        targetDistanse = Math.sqrt((Math.pow(target.position.getX() - this.getX(), 2)) + (Math.pow(target.position.getY() - this.getY(), 2)));
        return targetDistanse;
    }

    public Position getDiff (Position targetPos){
        return new Position(x - targetPos.getX(), y - targetPos.getY());
    }

}
