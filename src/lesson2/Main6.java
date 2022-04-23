package lesson2;

public class Main6 {
    public static void main(String[] args) {
        //напечатать на консоль сумму чисел от 60 до 100

        //summa=60+61+62...

        int summa = 0;

        for (int i = 60; i <= 100; i++) {
            summa = summa + i;
        }
        System.out.println(summa);

    }
}
