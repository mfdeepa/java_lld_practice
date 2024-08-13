package practiceDesignPattern.pen2.model;

import lombok.Getter;

@Getter
public class Refill {
    private Ink ink;
    private Nib nib;

    public Refill(Ink ink, Nib nib) {
        this.ink = ink;
        this.nib = nib;
    }

    public void setInk(Ink ink) {

        this.ink = ink;
    }

}
