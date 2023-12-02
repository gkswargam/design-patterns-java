package org.gks.creational.singleton.v1;

/*
    This way of creating Singleton class is called eager initialization, instance variable will be
    created only once when class is loading.

    Drawbacks:
    1. This way of creating Singleton class might increase the application start-up time, as class loading
    happens at the time of application start-up.
    2. No configuration can be passed to this class during application start-up.
 */
public class Singleton {
    // eager initialization
    private static final Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
