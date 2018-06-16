package task3.writeWith;

import lombok.Getter;
import task3.properties.Colour;
import task3.properties.Thickness;

@Getter
public class Highlighter extends SmthToWriteWith {
    private Thickness thickness;

    public Highlighter(Thickness thickness, int price, Colour highlColour) {
        super(highlColour, price);
        this.thickness = thickness;
    }
}
