package lesson3;

public class Main3 {
    public static void main(String[] args) {
        // есть массив целых чисел. 4,7,5,2,9
        // напечатать на консоль сумму четных чисел ----->6

        int[] numbers = {4, 7, 5, 2, 9};
        int summa = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                summa =summa+numbers[i];

            }
        }
        System.out.println(summa);

    }
}
