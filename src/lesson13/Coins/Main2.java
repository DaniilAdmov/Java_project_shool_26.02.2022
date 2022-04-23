package lesson13.Coins;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(1800, 5, 2.5, "Золото");
        Coin coin2 = new Coin(1800, 5, 2.5, "Золото");
        Coin coin3 = new Coin(1860, 20, 3, "Серебро");
        Coin coin4 = new Coin(1820, 10, 7, "Олово");
        Coin coin5 = new Coin(1900, 1, 2.5, "Золото");


        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);


        CoinSort.printCoinByMetal(coins);
        CoinSort.printCoinByNominal(coins);


    }
}
