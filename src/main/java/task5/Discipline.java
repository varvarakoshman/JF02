package task5;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Discipline<T extends Number> {
    private Disciplines_list dis_name;
    private T mark;

    public Discipline(Disciplines_list dis_name, T mark) {
        this.dis_name = dis_name;
        this.mark = mark;
    }

}
