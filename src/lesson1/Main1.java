package lesson1;

public class Main1 {

    public static void main(String[] args) {

        int a = 5;
        int b = 4;
        int c = 8;

        if (a == b && b == c && c == a) {
            System.out.println("Равносторонний треуголник");
        }
        if (a != b && b != c && c != a) {
            System.out.println("Разносторонний треуголник");
        }
        if (a != b && b != c && c == a) {
            System.out.println("Равнобедренный треуголник");

        }
    }
}
