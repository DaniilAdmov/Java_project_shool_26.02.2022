package lesson8;

public class Pramoygolnik {
    private int a;
    private int b;


    public Pramoygolnik() {
    }

    public Pramoygolnik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;

    }

    public int plashad() {
        // this - не  явный входящий параметр
        return this.a * this.b;
    }

    public int perimetr() {
        return (this.a + this.b) * 2;
    }



    //переопределение метода - (собез)
    // мы переписываем логику родительского метода

    @Override// анотация -
    public boolean equals(Object o) {
        // o ----> pramougolnik2
        // this ---->  pramougolnik1


        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pramoygolnik that = (Pramoygolnik) o;//

        if (a != that.a) return false;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;

    }

    @Override
    public String toString() {
        return "Pramoygolnik{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
