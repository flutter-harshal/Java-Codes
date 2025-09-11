import java.util.*;

class Student5{
    String name;
    int age;

    Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Comparator to sort by name
class NameComparator implements Comparator<Student5> {
    public int compare(Student5 s1, Student5 s2) {
        return s1.name.compareTo(s2.name);
    }
}

// Comparator to sort by age
class AgeComparator implements Comparator<Student5> {
    public int compare(Student5 s1, Student5 s2) {
        return s1.age - s2.age;
    }
}

public class ComparatorPro {
    public static void main(String[] args) {
        ArrayList<Student5> list = new ArrayList<>();
        list.add(new Student5("Ram", 22));
        list.add(new Student5("Shyam", 20));
        list.add(new Student5("Mohan", 25));

        System.out.println("Sort by Name:");
        Collections.sort(list, new NameComparator());
        for(Student5 s : list) {
            System.out.println(s.name + " " + s.age);
        }

        System.out.println("\nSort by Age:");
        Collections.sort(list, new AgeComparator());
        for(Student5 s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
