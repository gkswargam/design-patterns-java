package org.gks.creational.singleton.v1;

/*
    This way of creating Singleton class is called eager initialization, instance variable will be
    created only once when class is loading.

    Drawbacks:
    1. This way of creating Singleton class might increase the application start-up time, as class loading
    happens at the time of application start-up.
    2. No configuration can be passed to this class during application start-up.
 */
public class SingletonV1 {
    // eager initialization
    private static final SingletonV1 instance = new SingletonV1();

    private SingletonV1() {}

    public static SingletonV1 getInstance() {
        return instance;
    }
}
