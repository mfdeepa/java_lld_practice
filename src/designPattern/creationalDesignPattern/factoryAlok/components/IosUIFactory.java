package designPattern.creationalDesignPattern.factoryAlok.components;

import designPattern.creationalDesignPattern.factoryAlok.components.button.IosButton;
import designPattern.creationalDesignPattern.factoryAlok.components.dropdown.IosDropdown;
import designPattern.creationalDesignPattern.factoryAlok.components.menu.IosMenu;

public class IosUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }
}
