package lesson13.Coins;

import java.util.Comparator;
import java.util.TreeSet;

public class CoinSort {

    public static void printCoinByMetal(TreeSet<Coin> coins) {
        TreeSet<Coin> coinsByMetal = new TreeSet<>(new SortByMetalComparator());
        coinsByMetal.addAll(coins);
        for (Coin coin : coinsByMetal) {
            System.out.println(coin);
        }
    }

    public static void printCoinByNominal(TreeSet<Coin> coins) {
        TreeSet<Coin> coinsByMetal = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if (o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();
                }

                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }

                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }

                if (!o1.getMetal().equals(o2.getMetal())) {
                    return o1.getMetal().compareTo(o2.getMetal());
                }

                return 0;
            }
        });
        coinsByMetal.addAll(coins);
        for (Coin coin : coinsByMetal) {
            System.out.println(coin);
        }
    }

    public static void printCoinByYearFromTo(TreeSet<Coin> coins) {

    }


}
