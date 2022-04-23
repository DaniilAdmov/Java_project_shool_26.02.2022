package lesson14;

public class Main2 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.putProduct("Бананы", 2);
        fridge.putProduct("Яблоки", 1);
        fridge.putProduct("Груши", 3);
        fridge.putProduct("Бананы", 4);

        fridge.getProduct("Бананы", 2);

        fridge.printAllProducts();


    }


}
