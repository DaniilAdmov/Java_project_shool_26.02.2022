package lesson11;

public class Main1 {
    public static void main(String[] args) {

        Bear bear1 = new Bear();
        Bear bear2 = new Bear();

        Tiger tiger1 = new Tiger();
        Tiger tiger2 = new Tiger();

        Elephant elephant1 = new Elephant();
        Elephant elephant2 = new Elephant();


        AbstractAnimal[] animals = new AbstractAnimal[6];
        animals[0] = elephant1;
        animals[1] = elephant2;
        animals[2] = tiger1;
        animals[3] = bear1;
        animals[4] = bear2;
        animals[5] = tiger2;


        for (AbstractAnimal currentAnimal : animals) {
            currentAnimal.voice(); //проявление полиморфизма
        }
    }
}
