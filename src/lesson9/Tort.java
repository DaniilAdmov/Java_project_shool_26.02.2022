package lesson9;

public class Tort implements Baking {




    @Override
    public long getPrice() {
        return 1000;
    }

    @Override
    public String getDescription() {
        return "Торт";
    }

    @Override
    public void about() {
        System.out.println(getDescription() + " и его цена " + getPrice());

    }

}
