package lesson2;

public class Main2 {

    public static void main(String[] args) {

        int mark =4;

        switch (mark){
            case 5:
                System.out.println("ОТлично!");
                break;
            case 4:
                System.out.println("Хорошо!");
                break;
            case 3:
                System.out.println("Не очень!");
                break;
            case 2:
                System.out.println("Плохо!");
                break;
            default:
                System.out.println("Это не оценка!!!");

        }

    }

}
