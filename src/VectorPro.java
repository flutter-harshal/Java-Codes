import java.util.Vector;

public class VectorPro {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        vector.add(10);
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);

        System.out.println(vector);

        vector.remove(2);
        System.out.println(vector);


        System.out.println(vector.get(3));
    }
}
