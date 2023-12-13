package org.gks.creational.factory.components;

import org.gks.creational.factory.components.button.AndroidButton;
import org.gks.creational.factory.components.button.Button;
import org.gks.creational.factory.components.dropdown.AndroidDropdown;
import org.gks.creational.factory.components.dropdown.Dropdown;
import org.gks.creational.factory.components.menu.AndroidMenu;
import org.gks.creational.factory.components.menu.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public Dropdown createDropdown() {
        return new AndroidDropdown();
    }
}
