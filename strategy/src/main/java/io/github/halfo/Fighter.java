package io.github.halfo;

public class Fighter {
    private String name;
    private int health;
    private FightStyle style;

    Fighter(String name, int health, FightStyle style) {
        this.name = name;
        this.health = health;
        this.style = style;
    }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public void printStyle() { style.fight(); }
    public void changeStyle(FightStyle style) { this.style = style; }
}
