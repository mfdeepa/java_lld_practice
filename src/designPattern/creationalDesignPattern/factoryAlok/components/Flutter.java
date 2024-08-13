package designPattern.creationalDesignPattern.factoryAlok.components;

public class Flutter {
    SupportedPlatform platform;
    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }
    public void setTheme(){
        System.out.println("Setting Theme....");
    }
    public void SetRefreshRate(){
        System.out.println("Setting Refresh rate to 120HZ");
    }
    public UIFactory getFactory(){
//        if(this.platform == SupportedPlatform.IOS){
//            return new IosUIFactory();
//        } else if (this.platform == SupportedPlatform.ANDROID) {
//            return new AndroidUIFactory();
//        }
//        return null;

        // i have comment above if else statement. and instead of doing this,
        //i have created a new UiFactoryFactory.

        return UiFactoryFactory.getUiFactoryForPlatform(this.platform);
    }
}
