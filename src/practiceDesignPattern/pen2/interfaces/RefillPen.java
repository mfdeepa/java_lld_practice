package practiceDesignPattern.pen2.interfaces;

import practiceDesignPattern.pen2.model.Ink;
import practiceDesignPattern.pen2.model.Refill;

public interface RefillPen {


    public Boolean canRefill();

    public Refill getRefill(Ink ink);
}
