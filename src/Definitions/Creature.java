package Definitions;

import java.awt.*;

public class Creature {

    protected int gridX, gridY;
    String name;
    int size;
    Color color;

    public Creature(String name, int size, Color color, int x, int y) {
        this.gridX = x;
        this.gridY = y;
        this.name = name;
        this.size = size;
        this.color = color;
    }

    public void die() {

    }

    public void reproduce() {

    }

    public void draw(Graphics g) {
        g.setColor(color);
        int drawX = gridX * 15 + 4;
        int drawY = gridY * 15 +4;
        int drawSize = size -8;
        g.fillOval(drawX, drawY, drawY, drawSize);
        g.setFont(new Font("SansSerif", Font.PLAIN, 9));
        g.setColor(Color.WHITE);
        g.drawString(name, drawX +2, drawY + (drawSize / 2) + 5);
    }
}

