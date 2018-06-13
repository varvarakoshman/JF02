package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;

@AllArgsConstructor
public class Person {
    private ArrayList<Pen> penList;
    private ArrayList<Notepad> notepadList;
    private ArrayList<Scissors> scissorsList;
    private ArrayList<Pencil> pencilList;
    @Getter
    private String name;

    public <E> void addEl(E obj) {
        if (obj instanceof Pen) {
            penList.add((Pen) obj);
        } else if (obj instanceof Notepad) {
            notepadList.add((Notepad) obj);
        } else if (obj instanceof Scissors) {
            scissorsList.add((Scissors) obj);
        } else {
            pencilList.add((Pencil) obj);
        }
    }


    public int totalCost() {
        int sum = 0;
        for (Scissors el : this.scissorsList) {
            sum += el.getPrice() * el.getNumber();
        }
        for (Notepad el : this.notepadList) {
            sum += el.getPrice() * el.getNumber();
        }
        for (Pen el : this.penList) {
            sum += el.getPrice() * el.getNumber();
        }
        for (Pencil el : this.pencilList) {
            sum += el.getPrice() * el.getNumber();
        }
        return sum;
    }

}
