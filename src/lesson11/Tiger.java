package lesson11;

public class Tiger extends AbstractAnimal {
    @Override
    public void printHaveHvost() {
        System.out.println("Есть");
    }

    @Override
    public void voice() {
        System.out.println("РРР-ррр");
    }
}

