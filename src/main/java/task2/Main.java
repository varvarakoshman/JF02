/*
 *Задание 2.
 *Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
 *Определите полную стоимость канцтоваров у определенного сотрудника.
 */
package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pen> penList = new ArrayList<>();
        penList.add(new Pen(90, 5));
        ArrayList<Notepad> notepadList = new ArrayList<>();
        notepadList.add(new Notepad(150, 3));
        ArrayList<Scissors> scissorsList = new ArrayList<>();
        scissorsList.add(new Scissors(100, 2));
        ArrayList<Pencil> pencilList = new ArrayList<>();
        pencilList.add(new Pencil(30, 6));
        Person person1 = new Person(penList, notepadList, scissorsList, pencilList, "person_1");
        System.out.printf("Name:  %s  Total cost of stuff:  %d\n", person1.getName(), person1.totalCost());
        person1.addEl(new Pen(110, 2));
        person1.addEl(new Notepad(190, 1));
        System.out.printf("Name:  %s |ordered more stuff| New cost:  %d\n", person1.getName(), person1.totalCost());
    }
}
