package lesson4;

public class Main4 {
    public static void main(String[] args) {
        int[][] chees = new int[8][8];
//Вывести диагональ (реверс от обычной)

        for (int i = 0; i < chees.length; i++) {
            for (int j = 0; j < chees[i].length; j++) {
                if (((chees[i].length - j) - 1) == i) {
                    System.out.print("1" + " ");
                } else {
                    System.out.print(chees[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
