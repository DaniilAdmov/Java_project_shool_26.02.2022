package lesson2;

public class Main {

    public static void main(String[] args) {

        int money = 1000;
        int pizzaCost = 260;
        int bubbleCost = 26;
        double candyCost = 2.5;


        // математические операторы
        // "+" "-" "/" "*"
        // "++" (увелечение на единицу) инкремент
        // "--" (уменьшение на единицу)
        // "%"  вычисление остатка от деления 10 % 3 = 1; 12 % 2 = 0; 3 % 2 = 1;


        int canByPizza = money / pizzaCost; //получится целое число!!!
        int restAfterPizzaBy = money % pizzaCost; // выщитали 80 руб сдачи
        int canByBubble = restAfterPizzaBy / bubbleCost; // 80 / 26 = 3.***
        int restAfterBubbleBy = restAfterPizzaBy % bubbleCost; // 80 % 26 = 4

        int canByCandy = (int) (restAfterBubbleBy / candyCost); /// !!!
        double totalRest = restAfterBubbleBy - (canByCandy * canByBubble);


        System.out.println("Кол-во пицц: " + canByPizza);
        System.out.println("Кол-во жвачек: " + canByBubble);
        System.out.println("Кол-во конфет: " + canByCandy);


        // преобразование типа int ---> double, byte ---> int
        //


    }
}
