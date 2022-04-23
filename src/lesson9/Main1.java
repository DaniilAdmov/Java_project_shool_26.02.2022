package lesson9;

public class Main1 {
    public static void main(String[] args) {


        Baking baking = new Tort();
        Baking baking2 = new Tort();


        baking = new Cream(baking);
        baking.about();

        baking2 = new Chocolate(baking);
        baking2.about();

    }
}
