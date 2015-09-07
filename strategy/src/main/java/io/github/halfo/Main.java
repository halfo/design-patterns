package io.github.halfo;

public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter("Batman", 100, new Aggressive());
        fighter.printStyle();

        fighter.setHealth((int) (Math.random() * 101));
        fighter.changeStyle(fighter.getHealth() > 50 ?
                              new Aggressive() :
                              new Defensive());
        fighter.printStyle();
    }
}
