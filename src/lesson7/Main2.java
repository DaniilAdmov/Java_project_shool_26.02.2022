package lesson7;

public class Main2 {
    public static void main(String[] args) {

        Tovar tovar = new Tovar("Мышка", 2000);
        Developer lg = new Developer(("LG"));
        lg.setDescription("Это Корейский производитель");
        lg.setPathToPicture("C//");

        tovar.setDeveloper(lg);

        User user1 = new User("Алеша", "Вадим", 140);
        user1.setPathToAvatar("C//");


        Otziv otziv = new Otziv();
        otziv.setUser(user1);
        otziv.setRating(5);
        otziv.setMainText("Все ок если не включать");


        tovar.addOtzivToTovar(otziv);
        System.out.println();

        //Создать типы: Круг, Треугольник, Прямоугольник, Квадрат, Овал
        // Прописать в них нужные поля класса(сами определяем где какие)
        // Создать get-set и контструктор
        //Создать в Main по 1 обьекту каждого класса и установить все характиристики

    }
}
