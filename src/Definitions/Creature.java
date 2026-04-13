package Definitions;

public class Creature {

    protected int gridX, gridY;
    String name;
    int size;

    public Creature(String name, int size, int x, int y) {
        this.gridX = x;
        this.gridY = y;
        this.name = name;
        this.size = size;
    }

    public void die() {

    }

    public void reproduce() {

    }
}

