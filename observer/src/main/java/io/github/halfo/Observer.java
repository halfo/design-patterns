package io.github.halfo;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
