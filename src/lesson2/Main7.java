package lesson2;

public class Main7 {
    public static void main(String[] args) {
        double money = 100000;
        int years=5;
        int procent=18;

        for (int month = 0; month<years*12;month++){
            money=(money+(money/100*procent)/12);
        }
        System.out.println(money);
    }
}
