package task3.writeOn;

import lombok.Getter;
import task3.properties.Colour;

@Getter
public class Stickers extends SmthToWriteOn {
    private Colour stickerColour;

    public Stickers(int numberOfsheets, int price, Colour stickerColour) {
        super(numberOfsheets, price);
        this.stickerColour = stickerColour;
    }

}
