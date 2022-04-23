package lesson8;

public class Main1 {
    public static void main(String[] args) {
        Pramoygolnik pramoygolnik1 = new Pramoygolnik(3, 5);
        Pramoygolnik pramoygolnik2 = new Pramoygolnik(3, 5);
        System.out.println(pramoygolnik1.perimetr());


        int perimPR1 = pramoygolnik1.perimetr();
        System.out.println(perimPR1);

        System.out.println(pramoygolnik1.equals(pramoygolnik2));

        System.out.println(pramoygolnik1.hashCode());
        System.out.println(pramoygolnik2.hashCode());

        System.out.println(pramoygolnik1.toString());

    }


}
