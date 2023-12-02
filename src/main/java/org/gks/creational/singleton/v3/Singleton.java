package org.gks.creational.singleton.v3;

/*
    This way of creating Singleton class is thread safe and provide better performance.
    It is called double check locking.

    Drawbacks:
    1. It is verbose or requires more lines of code to implement.
 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    /*
        Instance creation piece of code is called only when instance is not created, and it is not called
        every time when this method is called. There is no lock on the entire method.
     */
    public static Singleton getInstance() {
        if(instance == null) {
            synchronized(Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
