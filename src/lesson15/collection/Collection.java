package lesson15.collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        Person student1 = new Person(1, "Ivan", 4);
        Person student2 = new Person(2, "Elena", 2);
        Person student3 = new Person(3, "Inna", 1);
        Person student4 = new Person(5, "Petr", 5);
        Person student5 = new Person(5, "Petr", 5);

        TreeMap<String, Integer> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {



                return 0;
            }
        });

//        treeMap.put(student1,22);




//
//        Map<Person, Double> studentMap = new HashMap<>();
//
//        studentMap.put(student4, 9.2);
//        studentMap.putIfAbsent(student5, 6.7);
//
//        studentMap.get(student5);
//        System.out.println(studentMap);
//
//        System.out.println(studentMap.containsKey(student4));
//
//        List<String> strings = new LinkedList<>();

    }
}
