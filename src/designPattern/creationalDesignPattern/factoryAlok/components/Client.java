package designPattern.creationalDesignPattern.factoryAlok.components;

import designPattern.creationalDesignPattern.factoryAlok.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter ft = new Flutter(SupportedPlatform.IOS);
        UIFactory uf = ft.getFactory();
        Button bt = uf.createButton();
        bt.changeSize();
    }
}
