package designPattern.creationalDesignPattern.factoryAlok.components;

import designPattern.creationalDesignPattern.factoryAlok.components.button.AndroidButton;
import designPattern.creationalDesignPattern.factoryAlok.components.dropdown.AndroidDropdown;
import designPattern.creationalDesignPattern.factoryAlok.components.menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createDropdown() {
        return new AndroidDropdown();
    }
}
