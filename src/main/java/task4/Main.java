/*
 * Задание 4.
 * Используйте “набор новичка”, созданный в задании 3, (или любую другую коллекцию объектов);
 * отсортируйте вещи в этом наборе по стоимости, по наименованию, по стоимости и наименованию.
 */
package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Stationery> stationeries = new ArrayList<>();
        stationeries.add(new Stationery("A pen", 90));
        stationeries.add(new Stationery("Pencil", 40));
        stationeries.add(new Stationery("Stickers", 60));
        stationeries.add(new Stationery("Highlighter", 120));
        stationeries.add(new Stationery("Notepad", 220));
        System.out.println("Sorting by price:");
        Collections.sort(stationeries, Comparator.comparing((Stationery st) -> st.getPrice())
                .reversed());
        stationeries.forEach((stationery) -> System.out.println(stationery));
        System.out.println("Sorting by name:");
        Collections.sort(stationeries, Comparator.comparing(Stationery::getName));
        stationeries.forEach((stationery) -> System.out.println(stationery));
        System.out.println("Sorting by both name and price:");
        Collections.sort(stationeries, Comparator.comparing(Stationery::getPrice)
                .thenComparing(Stationery::getName));
        stationeries.forEach((stationery) -> System.out.println(stationery));
    }
}
