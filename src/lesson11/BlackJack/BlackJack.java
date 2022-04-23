package lesson11.BlackJack;

import java.util.ArrayList;

public class BlackJack implements IBlackJack {


    private Deck deck = new Deck();
    private ArrayList<IPlayer> players = new ArrayList<>();


    @Override
    public void addPlayer(IPlayer player) {
        players.add(player);
    }

    @Override
    public void dealTwoCards() {
        for (IPlayer player : players) {
            player.addCardToHand(deck.getRandomCard());
            player.addCardToHand(deck.getRandomCard());
        }
    }

    @Override
    public void dealAllCards() {
        for (IPlayer player : players) {
            while (player.needMoreCards()) {// Полиморфизм
                player.addCardToHand(deck.getRandomCard());
            }
        }
    }

    @Override
    public void printWinner() {
//21     21     34     19     18     21---21 win
//19     21     34     19     18     19---19 win
//19     20     34     19     18   ---20 win
//21     25     34     19     18   ---крупье


        /// устанавливаем флан не в игре, всем у кого перебор
        for (IPlayer player : players) {
            if (player.countValuesHand() > 21) {
                player.setInGame(false);

            }
        }
        //Если у всех перебор, выиграл крупье
        if (countPlayersInGame() == 0) {
            for (IPlayer player : players) {
                if (player instanceof Dealer) {
                    System.out.println("-------ПОБЕДИТЕЛЬ" + player.getName());
                    player.openHand();
                }
            }
        }
        // узнаем выграшное число
        //23    34     21     19     21

        int winnerValue = 0;
        for (IPlayer player : players) {
            if (player.isInGame() && player.countValuesHand() > winnerValue) {
                winnerValue = player.countValuesHand();
            }
        }
        // вывод победителя
        for (IPlayer player : players) {
            if (player.isInGame() && player.countValuesHand() == winnerValue) ;
            System.out.println("-------ПОБЕДИТЕЛЬ" + player.getName());
            player.openHand();
        }


    }

    public int countPlayersInGame() {
        int count = 0;
        for (IPlayer player : players) {
            if (player.isInGame()) {
                count++;
            }
        }
        return count;
    }
}
