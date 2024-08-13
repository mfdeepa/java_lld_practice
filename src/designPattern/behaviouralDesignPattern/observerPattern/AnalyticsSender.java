package designPattern.behaviouralDesignPattern.observerPattern;

public class AnalyticsSender implements OrderCancelledSubscriber, OrderPlacedSubscriber{
    public AnalyticsSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {

    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Updating analaytics");
        return null;
    }
}
