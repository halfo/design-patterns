package io.github.halfo;

/*
 * Supports for Multithreading
 * But 'synchronized' is too slow (upto 100x)
 */

public class Singleton2 {
    private static Singleton2 instance = null;

    protected Singleton2() {}

    public synchronized static Singleton2 getInstance() {
        if (instance == null)
            instance = new Singleton2();
        return instance;
    }
}
