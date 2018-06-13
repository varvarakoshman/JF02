/*
 *Задание 1.
 *Разработайте спецификацию и создайте класс Ручка (Pen).
 *Определите в этом классе методы equals(), hashCode() и toString().
 */
package task1;

public class Main {
    public static void main(String[] args) {
        Pen pen1 = new Pen("PILOT", "black", 90);
        Pen pen2 = new Pen("ErichKrause", "blue", 110);
        System.out.println(pen1.equals(pen2));
    }
}
