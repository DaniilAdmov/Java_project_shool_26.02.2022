package lesson13.Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class MainCollection {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);

        HashSet<Integer> b = new HashSet<>();
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);


        CollectionUtilsImpl until = new CollectionUtilsImpl();
        System.out.println(until.union(a, b));
        System.out.println(until.intersection(a, b));
        System.out.println(until.unionWithoutDuplicate(a, b));
        System.out.println(until.intersectionWithoutDuplicate(a, b));
        System.out.println(until.difference(a, b));


    }
}
