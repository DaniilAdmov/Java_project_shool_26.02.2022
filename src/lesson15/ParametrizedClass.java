package lesson15;

import java.util.ArrayList;
import java.util.List;

public class ParametrizedClass {
    public static void main(String[] args) {

        Example<Integer> stringExamples = new Example<>();
        List<?> objects = new ArrayList<String>();
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("hello");
        strings.add("hello");

        stringExamples.printElementCollection(strings);

    }
}


class Example<T extends Number> {
    T value;


    public void showValue() {
        System.out.println(value);


    }

    public <V> void printElementCollection(List<V> values) {

        for (V v : values) {
            System.out.println(v);
        }
    }

//    public <R, L> R mapper(L from, R to) {
//
//
//    }
//
//
//
}