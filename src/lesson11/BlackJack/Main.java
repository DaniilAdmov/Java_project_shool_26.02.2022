package lesson11.BlackJack;

public class Main {
    public static void main(String[] args) {

        BlackJack blackJack = new BlackJack();


        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");
        Player player3 = new Player("kek");
        Dealer dealer = new Dealer("Крупье");

        blackJack.addPlayer(player1);
        blackJack.addPlayer(player2);
        blackJack.addPlayer(player3);
        blackJack.addPlayer(dealer);

        blackJack.dealTwoCards();
        blackJack.dealAllCards();
        blackJack.printWinner();


    }
}
