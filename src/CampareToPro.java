import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // compare by age
    public int compareTo(Student s) {
        return this.age - s.age;
    }
}

public class CampareToPro {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Ram", 22));
        list.add(new Student("Shyam", 20));
        list.add(new Student("Mohan", 25));

        Iterator itr= list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


        Collections.sort(list);  // uses compareTo()

        for(Student s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
