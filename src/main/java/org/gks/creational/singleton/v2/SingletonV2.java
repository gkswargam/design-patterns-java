package org.gks.creational.singleton.v2;

/*
    This way of creating Singleton class is thread safe;

    Drawbacks:
    1. This way of creating Singleton class might lead to performance issues as synchronized
    methods can be accessed by only one thread at a time.
 */
public class SingletonV2 {
    private static SingletonV2 instance;

    private SingletonV2() {}

    // Every time this method is called, there will be a lock on this entire method due to
    // synchronized keyword, so that only one thread can access it at any point.
    public static synchronized SingletonV2 getInstance() {
        if(instance == null) {
            instance = new SingletonV2();
        }

        return instance;
    }
}
