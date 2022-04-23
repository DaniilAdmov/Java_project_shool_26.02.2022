package lesson11;

public class Bear extends AbstractAnimal {


    @Override
    public void printHaveHvost() {
        System.out.println("Нету");
    }

    @Override
    public void voice() {
        System.out.println("Bre");
    }
}
