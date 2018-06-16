/*
 *Разработайте иерархию канцелярских товаров.
 *Создайте “набор новичка”, используя созданную иерархию.
 */
package task3;

import task3.properties.Colour;
import task3.properties.Thickness;
import task3.properties.TypeOfPage;
import task3.writeOn.Notepad;
import task3.writeOn.Stickers;
import task3.writeWith.Highlighter;
import task3.writeWith.Pen;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad(96, 190, TypeOfPage.CELL);
        Pen pen = new Pen(1, 90, Colour.BLUE);
        Highlighter highlighter = new Highlighter(Thickness.STANDARD, 100, Colour.GREEN);
        Stickers stickers = new Stickers(50, 50, Colour.RED);
        BaseKit basekit = new BaseKit(notepad, stickers, pen, highlighter);
        basekit.printKit();
    }
}
