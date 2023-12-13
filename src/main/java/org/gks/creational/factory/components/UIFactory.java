package org.gks.creational.factory.components;

public class UIFactory {
    public static UIComponentFactory getUIComponentFactory(PlatformType platformType) {
        if(platformType.toString().equals("ANDROID")) {
            return new AndroidUIComponentFactory();
        } else if(platformType.toString().equals("IOS")) {
            return new IOSUIComponentFactory();
        }

        return null;
    }
}
