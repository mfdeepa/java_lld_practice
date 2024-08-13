package designPattern.creationalDesignPattern.factoryAlok.components;

import designPattern.creationalDesignPattern.factoryAlok.components.button.Button;
import designPattern.creationalDesignPattern.factoryAlok.components.dropdown.Dropdown;
import designPattern.creationalDesignPattern.factoryAlok.components.menu.Menu;

public interface UIFactory {
    public Button createButton();
    public Menu createMenu();
    public Dropdown createDropdown();

}
