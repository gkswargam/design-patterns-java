package org.gks.creational.factory;

import org.gks.creational.factory.components.IOSUIComponentFactory;
import org.gks.creational.factory.components.UIComponentFactory;

public class IOS extends Platform {
    public void setTheme() {
        System.out.println("Set IOS theme");
    }

    public void setRefreshRate() {
        System.out.println("Set IOS refresh rate");
    }

    public IOSUIComponentFactory getUIComponentFactory() {
        return new IOSUIComponentFactory();
    }
}
