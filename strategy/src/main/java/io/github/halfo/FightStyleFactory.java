package io.github.halfo;

public class FightStyleFactory {
    public FightStyle getFightStyle(int health) {
        return health > 50 ? new Aggressive() :
                      new Defensive()
    }
}
