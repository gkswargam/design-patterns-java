package org.gks.creational.factory.components;

import org.gks.creational.factory.components.button.Button;
import org.gks.creational.factory.components.button.IOSButton;
import org.gks.creational.factory.components.dropdown.Dropdown;
import org.gks.creational.factory.components.dropdown.IOSDropdown;
import org.gks.creational.factory.components.menu.IOSMenu;
import org.gks.creational.factory.components.menu.Menu;

public class IOSUIComponentFactory implements  UIComponentFactory {
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new IOSDropdown();
    }
}
