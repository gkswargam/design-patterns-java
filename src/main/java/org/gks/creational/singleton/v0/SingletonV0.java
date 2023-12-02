package org.gks.creational.singleton.v0;

/*
    Simple way to create Singleton class.

    Drawbacks:
     1. This way of creating Singleton class is not thread safe.
 */
public class SingletonV0 {
    private static SingletonV0 instance;

    private SingletonV0() { }

    public static SingletonV0 getInstance() {
        if(instance == null) {
            /*
                If multiple threads are calling this method before the first instance is created and
                if they enter this loop, then instance variable might be assigned new Singleton instance
                multiple times.
             */
            instance = new SingletonV0();
        }

        return instance;
    }
}
