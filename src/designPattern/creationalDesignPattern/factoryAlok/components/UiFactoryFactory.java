package designPattern.creationalDesignPattern.factoryAlok.components;

import designPattern.creationalDesignPattern.factoryAlok.components.menu.WebUiFactory;

public class UiFactoryFactory {
    public static UIFactory getUiFactoryForPlatform(SupportedPlatform platform){
        return switch(platform){
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case WEB -> new WebUiFactory();
        };
    }
}
