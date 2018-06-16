package task3;

import lombok.AllArgsConstructor;
import task3.writeOn.Notepad;
import task3.writeOn.Stickers;
import task3.writeWith.Highlighter;
import task3.writeWith.Pen;

@AllArgsConstructor
public class BaseKit {
    private Notepad notepad;
    private Stickers stickers;
    private Pen pen;
    private Highlighter highlighter;

    public void printKit() {
        System.out.printf("Notepad| type of page: %s number of sheets: %d price: %d\n", this.notepad.getTypeOfPage().toString(), this.notepad.getNumberOfsheets(), this.notepad.getPrice());
        System.out.printf("Stickers| colour of stickers: %s  number of sheets: %d  price: %d\n", this.stickers.getStickerColour().toString(), this.stickers.getNumberOfsheets(), this.stickers.getPrice());
        System.out.printf("Pen| number of inks: %d colour of ink: %s  price: %d\n", this.pen.getNumberOfinksInside(), this.pen.getColour().toString(), this.pen.getPrice());
        System.out.printf("Highlighter| thickness: %s colour of ink: %s price: %d\n", this.highlighter.getThickness().toString(), this.highlighter.getColour(), this.highlighter.getPrice());
    }
}
