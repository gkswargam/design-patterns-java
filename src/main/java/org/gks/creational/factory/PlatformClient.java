package org.gks.creational.factory;

import org.gks.creational.factory.components.PlatformType;
import org.gks.creational.factory.components.UIComponentFactory;

public class PlatformClient {
    public static void main(String[] args) {
        Platform p = new Platform();
        UIComponentFactory uiComponentFactory = p.getUIComponentFactory(PlatformType.IOS);
        uiComponentFactory.createButton().display();
        uiComponentFactory.createDropdown().display();
        uiComponentFactory.createMenu().display();
    }
}
