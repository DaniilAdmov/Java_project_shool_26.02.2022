package lesson13.Collection;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {


    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> union = new LinkedList<>();
        union.addAll(a);
        union.addAll(b);
        return union;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int numbersB : b) {
            if (a.contains(numbersB)) {
                intersection.add(numbersB);
            }
        }
        for (int numbersA : a) {
            if (b.contains(numbersA)) {
                intersection.add(numbersA);
            }
        }
        return intersection;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> unionWithoutDuplicate = new HashSet<>();
        unionWithoutDuplicate.addAll(a);
        unionWithoutDuplicate.addAll(b);
        return unionWithoutDuplicate;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> intersectionWithoutDuplicate = new HashSet<>();
        for (int numbersA : a) {
            if (b.contains(numbersA)) {
                intersectionWithoutDuplicate.add(numbersA);
            }
        }
        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> difference = new HashSet<>();
        difference.addAll(a);
        difference.addAll(b);
        for (int numbersA : a) {
            if (b.contains(numbersA)) {
                difference.remove(numbersA);
            }
        }
        return difference;
    }
}
