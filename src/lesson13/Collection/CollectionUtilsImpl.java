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
        for (int numbersA : a) {
            for (int numbersB : b) {
                if (numbersA == numbersB) {
                    intersection.add(numbersA);
                }
            }
        }
        for (int numbersB : b) {
            for (int numbersA : a) {
                if (numbersA == numbersB) {
                    intersection.add(numbersB);
                }
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
            for (int numbersB : b) {
                if (numbersA == numbersB) {
                    intersectionWithoutDuplicate.add(numbersA);
                }
            }
        }
        return intersectionWithoutDuplicate;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> difference = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        set.addAll(a);
        set.addAll(b);
        for (int numbersA : a) {
            for (int numbersB : b) {
                if (numbersA == numbersB) {
                    set.remove(numbersA);
                }
            }
        }
        difference.addAll(set);
        return difference;
    }
}
