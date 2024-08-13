package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class Client {
    public static void main(String[] args) {
        int distance = 10;

        /*
         * Book a Micro Car for a distance of 10 kms
         */
        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory("Car");
        Vehicle miniCar = carFactory.getVehicle("Micro");
        miniCar.book(distance);
        int var = miniCar.calculateCostOfBooking(10);
        System.out.println(var);

        /*
         * Book a Personal Auto for a distance of 10 kms
         */
        AbstractVehicleFactory autoFactory = FactoryProvider.getVehicleFactory("Auto");
        Vehicle personalAuto = autoFactory.getVehicle("Personal");
        personalAuto.book(distance);

        /*
         * Book a Sports Bike for a distance of 10 kms
         */
        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("Bike");
        Vehicle sportsBike = bikeFactory.getVehicle("Sports");
        sportsBike.book(distance);

    }
}
