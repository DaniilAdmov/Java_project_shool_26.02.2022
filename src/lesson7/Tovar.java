package lesson7;

public class Tovar {

    private String name;
    private int price;
    private Developer developer;
    private Otziv[] otzivs = new Otziv[100];


    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Otziv[] getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(Otziv[] otzivs) {
        this.otzivs = otzivs;
    }

    public void addOtzivToTovar(Otziv otziv) {
        for (int i = 0; i < otzivs.length; i++) {
            if (otzivs[i] == null) ;
            otzivs[i] = otziv;
            break;

        }

    }
}
