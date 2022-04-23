package lesson4;

import java.util.Scanner;
//Автоматически
import java.lang.*;

public class Main2 {
    public static void main(String[] args) {
        //Программа с пользовательским интерфейсом

        System.out.println("Выберете фигуру: ");
        System.out.println("1 - квадрат");
        System.out.println("2 - круг");
        System.out.println("3 - овал");
        System.out.println("4 - прямоугольник");
        System.out.println("5 - треугольник");


        Scanner scanner = new Scanner(System.in);
        String figura = scanner.nextLine();

        // ==используется только к примитивным типам!!!

        //Площадь и периметр Квадрата
        if (figura.equals("1") || figura.equalsIgnoreCase("квадрат")) {
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();

            System.out.println("Введите сторону квадрата");
            String storona = scanner.nextLine();

            //Преобразование из String в int
            int a = Integer.parseInt(storona);

            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь квадрата =" + (a * a));
            } else if (action.equalsIgnoreCase("Периметр")){
                System.out.println("Периметр квадрата=" + (a * 4));
            }else {
                System.out.println("Выбран не существующий вариант");
            }

            //Площадь и периметр Круга
        } else if (figura.equals("2") || figura.equalsIgnoreCase("круг")) {
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();

            System.out.println("Введите радиус круга");
            String storona = scanner.nextLine();

            int r = Integer.parseInt(storona);

            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь круга=" + (Math.pow(r, 2) * 3.14));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр круга=" + 2 * r * 3.14);
            } else {
                System.out.println("Выбран не существующий вариант");
            }


            //Площадь и периметр Овала
        } else if (figura.equals("3") || figura.equalsIgnoreCase("овал")) {
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();

            System.out.println("Введите длину большей оси эллипса");
            String storonaA = scanner.nextLine();
            int a = Integer.parseInt(storonaA);

            System.out.println("Введите длину меньшей оси эллипса");
            String storonaB = scanner.nextLine();
            int b = Integer.parseInt(storonaB);

            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь овала=" + (a * b * 3.14));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр овала=" + (2 * 3.14 * (Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 8))));
            } else {
                System.out.println("Выбран не существующий вариант");
            }

            //Площадь и периметр Прямоугольника
        } else if (figura.equals("4") || figura.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();

            System.out.println("Введите сторону a");
            String storonaA = scanner.nextLine();
            int a = Integer.parseInt(storonaA);

            System.out.println("Введите сторону b");
            String storonaB = scanner.nextLine();
            int b = Integer.parseInt(storonaB);

            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь прямоуголнька =" + (a * b));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр прямоугольника=" + (2 * (a + b)));
            } else {
                System.out.println("Выбран не существующий вариант");
            }


            //Площадь и периметр Треугольника
        } else if (figura.equals("5") || figura.equalsIgnoreCase("треугольник")) {
            System.out.println("Площадь или периметр?");
            String action = scanner.nextLine();

            System.out.println("Введите сторону a");
            String storonaA = scanner.nextLine();
            int a = Integer.parseInt(storonaA);

            System.out.println("Введите сторону b");
            String storonaB = scanner.nextLine();
            int b = Integer.parseInt(storonaB);

            System.out.println("Введите сторону с");
            String storonaC = scanner.nextLine();
            int c = Integer.parseInt(storonaC);

            if (action.equalsIgnoreCase("Площадь")) {
                System.out.println("Площадь треугольника=" + ((a + b + c) / 2));
            } else if (action.equalsIgnoreCase("Периметр")) {
                System.out.println("Периметр треугольнка=" + (a + b + c));
            } else {
                System.out.println("Выбран не существующий вариант");
            }

        } else {
            System.out.println("Выбран не существующий вариант");
        }
    }
}
