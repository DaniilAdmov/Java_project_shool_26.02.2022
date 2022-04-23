package lesson15.collection;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap = new TreeMap();

        treeMap.put("Hello", 10);
        treeMap.put("Word", 7);
        treeMap.put("TreMap", 3);
        treeMap.put("Lesson", 2);

        System.out.println(treeMap);
    }
}
