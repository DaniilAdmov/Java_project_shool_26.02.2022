package lesson9;

public class Cream extends Dobavka {


    public Cream(Baking baking) {
        super(baking);
    }

    @Override
    public long getPrice() {
        return 20 + baking.getPrice();
    }

    @Override
    public String getDescription() {
        return "С кремом";
    }




}
