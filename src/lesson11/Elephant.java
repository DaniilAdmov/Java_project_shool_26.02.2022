package lesson11;


public class Elephant extends AbstractAnimal {

    @Override
    public void printHaveHvost() {
        System.out.println("Хвост есть");
    }

    @Override
    public void voice() {
        System.out.println("Бе-бе-бе Ба-ба-ба");
    }
}
