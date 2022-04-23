package lesson11.BlackJack;

public class Dealer extends Player implements IDealer {


    public Dealer(String name) {
        super(name);
    }

    @Override
    public boolean needMoreCards() {
        if (countValuesHand() < 18) {
            return true;
        }
        return false;
    }
}
