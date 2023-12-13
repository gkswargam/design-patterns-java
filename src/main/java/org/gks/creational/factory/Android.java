package org.gks.creational.factory;

import org.gks.creational.factory.components.AndroidUIComponentFactory;

public class Android extends Platform {
    public void setTheme() {
        System.out.println("Set Android theme");
    }

    public void setRefreshRate() {
        System.out.println("Set Android refresh rate");
    }

    public AndroidUIComponentFactory getUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
