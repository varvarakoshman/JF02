/*
Разработайте приложение, позволяющее формировать группы студентов по разным дисциплинам.
Состав групп может быть разным. Каждая дисциплина в отдельности определяет, целыми или вещественными будут оценки по нет.
Необходимо найти группы, в которые входит студент X, и сравнить его оценки.
Для огранизации перечня дисциплин можно использовать перечисление.
*/

package task5;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Discipline> list1 = new ArrayList<>();
        list1.add(new Discipline(Disciplines_list.TEORVER, 20));
        list1.add(new Discipline(Disciplines_list.KVANTMECH, 75.5));
        Student student1 = new Student("Петров", list1);
        ArrayList<Discipline> list2 = new ArrayList<>();
        list2.add(new Discipline(Disciplines_list.TEORVER, 15));
        list2.add(new Discipline(Disciplines_list.MATFIZ, 80));
        Student student2 = new Student("Иванов", list2);
        ArrayList<Discipline> list3 = new ArrayList<>();
        list3.add(new Discipline(Disciplines_list.KVANTMECH, 60.1));
        list3.add(new Discipline(Disciplines_list.MATFIZ, 75));
        Student student3 = new Student("Сидоров", list3);
        HashMap<String, ArrayList<Discipline>> map = new HashMap<>();
        map.put(student1.getName(), list1);
        map.put(student2.getName(), list2);
        map.put(student3.getName(), list3);
        System.out.printf("Marks of %s:\n", student1.getName()); //prints all marks of X student
        map.get(student1.getName()).forEach((discipline) -> System.out.println(discipline.getMark().toString()));
        System.out.printf("All groups of %s:\n", student1.getName()); //prints all groups X student belongs to
        map.get(student1.getName()).forEach((dis) -> System.out.println(dis.getDis_name().toString()));
        String required_dis = Disciplines_list.MATFIZ.toString(); //MATFIZ as an example
        System.out.printf("Group %s includes:\n", required_dis); //prints all members of given group
        map.entrySet().forEach((set) -> set.getValue().forEach((dis) -> {
            if (dis.getDis_name().toString().equals(required_dis))
                System.out.println(set.getKey());
        }));
    }
}
