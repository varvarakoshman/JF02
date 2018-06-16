package task5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;

@AllArgsConstructor
@ToString
@Getter
public class Student {
    private String name;
    private ArrayList<Discipline> subjects;
}
