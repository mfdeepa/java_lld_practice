package designPattern.creationalDesignPattern.factoryDesignPattern;
// creating factory class for generating objects.
public class GetPlan {
    public Plan getplan(String planType){
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTIC")) {
            return new Domestic();
        } else if (planType.equalsIgnoreCase("COMMERCIAL")) {
            return new Commercial();
        } else if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
            return new Institutional();
        }
        return null;
    }
}
