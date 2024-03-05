package Game.gameInterface;

import Game.heroCamp.BaseHero;

import java.util.ArrayList;
import java.util.List;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPosition(int value1, int value2) {
        this.x = value1;
        this.y = value2;
    }

    public List<Integer> getPosition (){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }

    public int getX() {return x;}

    public int getY() {return y;}

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }


    public double getDistanse (Position target) {
        double d = Math.sqrt(Math.pow(x - target.x, 2) + Math.pow(y - target.y, 2));

        return d;
    }

    public Position getDiff (Position target) {
        Position dif = new Position(x - target.x, y - target.y);
        return dif;
    }

    public boolean equals(Position target) {
        return x == target.x && y == target.y;
    }


}
