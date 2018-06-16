package task3.writeOn;

import lombok.Getter;
import task3.properties.TypeOfPage;

@Getter
public class Notepad extends SmthToWriteOn {
    private TypeOfPage typeOfPage;

    public Notepad(int numberOfsheets, int price, TypeOfPage typeOfPage){
        super(numberOfsheets, price);
        this.typeOfPage = typeOfPage;
    }
}
