package practiceDesignPattern.pen1.interfaces;

import practiceDesignPattern.pen1.model.Refill;

public interface RefillPen {
    public void changeRefill();
    public Refill getRefill();
    public boolean canRefill();
}
