package io.github.halfo;

/*
 * No support for Multithreading
 */

public class Singleton1 {
    private static Singleton1 instance = null;

    protected Singleton1() {}

    public static Singleton1 getInstance() {
        if (instance == null)
            instance = new Singleton1();
        return instance;
    }
}
