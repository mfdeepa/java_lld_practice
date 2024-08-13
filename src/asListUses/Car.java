package asListUses;

public class Car {
    String name;
    int units;
    Car(String name,int units){
        this.name = name;
        this.units = units;
    }
   public String toString(){
        return this.name+this.units;
    }
}
