package lesson2;

public class Main5 {

    public static void main(String[] args) {
        //напечатать числа в диапазоне от 100 до 150,
        //которые делятся на 3 и на 5 одновременно

        //105, 120, 135

        for (int i = 100; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
