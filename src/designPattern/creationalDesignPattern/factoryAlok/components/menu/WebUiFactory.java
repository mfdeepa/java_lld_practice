package designPattern.creationalDesignPattern.factoryAlok.components.menu;

import designPattern.creationalDesignPattern.factoryAlok.components.UIFactory;
import designPattern.creationalDesignPattern.factoryAlok.components.button.Button;
import designPattern.creationalDesignPattern.factoryAlok.components.dropdown.Dropdown;

public class WebUiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return null;
    }

    @Override
    public Menu createMenu() {
        return null;
    }

    @Override
    public Dropdown createDropdown() {
        return null;
    }
}
