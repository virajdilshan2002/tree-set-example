package Main;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet();

        t1.add(10);
        t1.add(50);
        t1.add(90);
        t1.add(90);
        t1.add(25);
        t1.add(25);
        t1.add(35);

        // TreeMap stores onliy unique elements in a sorted order.
        System.out.println(t1.size());        // 5
        System.out.println(t1.isEmpty());    // false
        System.out.println(t1);             // [10, 25, 35, 50, 90]


        // These methods inherit from SortedSet interface.
        System.out.println(t1.first());      // 10
        System.out.println(t1.last());      // 90
    }
}
