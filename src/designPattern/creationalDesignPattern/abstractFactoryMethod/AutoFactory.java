package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class AutoFactory extends AbstractVehicleFactory{
    Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("Personal"))
                return new PersonalAuto();
        else if(type.equalsIgnoreCase("Shared"))
                return new SharedAuto();
        else
                return new PersonalAuto();
    }
}
