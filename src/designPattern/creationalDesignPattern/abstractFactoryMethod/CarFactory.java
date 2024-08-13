package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class CarFactory extends AbstractVehicleFactory {
    Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Micro"))
            return new MicroCar();
        else if (type.equalsIgnoreCase("Mini"))
            return new MiniCar();
        else if (type.equalsIgnoreCase("Mega"))
            return new MegaCar();
        else
            return new MiniCar();
    }
}
