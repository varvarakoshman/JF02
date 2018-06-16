package task3.writeWith;

import lombok.Getter;
import task3.properties.Colour;

@Getter
public class Pen extends SmthToWriteWith {
    private int numberOfinksInside;

    public Pen(int numberOfinksInside, int price, Colour inkColour) {
        super(inkColour, price);
        this.numberOfinksInside = numberOfinksInside;
    }
}
