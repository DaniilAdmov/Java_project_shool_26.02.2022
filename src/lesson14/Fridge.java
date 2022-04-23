package lesson14;

import java.util.HashMap;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();

    public void putProduct(String product, int value) {
        if (products.containsKey(product)) {
            products.put(product, value + products.get(product));
        } else {
            products.put(product, value);
        }

    }

    public void printAllProducts() {
        for (String product : products.keySet()) {
            System.out.println(product + " - " + products.get(product));
        }
    }

    public void getProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Продукт отсутствует!!! - " + product);
            return;
        }
        if (products.get(product) < value) {
            System.out.println("Мы взяли только " + products.get(product) + "кг " + product);
            products.remove(product);
            return;
        }

        products.put(product, products.get(product) - value);
        System.out.println("Все взяли - " + product + " , " + value);
    }
}
