package org.gks.creational.factory;

import org.gks.creational.factory.components.PlatformType;
import org.gks.creational.factory.components.UIComponentFactory;
import org.gks.creational.factory.components.UIFactory;

public class Platform {
    public void setTheme() {
        System.out.println("Set platform theme");
    }

    public void setRefreshRate() {
        System.out.println("Set platform refresh rate");
    }

    public UIComponentFactory getUIComponentFactory() {
        return null;
    }

    public UIComponentFactory getUIComponentFactory(PlatformType platformType) {
        return UIFactory.getUIComponentFactory(platformType);
    }
}
