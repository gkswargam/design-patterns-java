package org.gks.creational.factory.components;

import org.gks.creational.factory.components.button.Button;
import org.gks.creational.factory.components.dropdown.Dropdown;
import org.gks.creational.factory.components.menu.Menu;

public interface UIComponentFactory {
    Button createButton();
    Menu createMenu();
    Dropdown createDropdown();
}
