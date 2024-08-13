package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class BikeFactory extends AbstractVehicleFactory{
    Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Normal"))
                return new NormalBike();
        else if(type.equalsIgnoreCase("Sports"))
                return new SportsBike();
        else
                return new NormalBike();
    }
}
