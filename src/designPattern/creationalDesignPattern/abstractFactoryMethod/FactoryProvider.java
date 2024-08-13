package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class FactoryProvider {
    static AbstractVehicleFactory getVehicleFactory(String factoryType) {
        if(factoryType.equalsIgnoreCase("Car"))
            return new CarFactory();
        else if(factoryType.equalsIgnoreCase("Auto"))
            return new AutoFactory();
        else if(factoryType.equalsIgnoreCase("Bike"))
            return new BikeFactory();
        else
            return new CarFactory();
    }
}
