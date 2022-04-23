package lesson3;

public class Main6 {
    public static void main(String[] args) {

        String email = "e123@mail.ru";


        // 1 - содержиться ли @
        // 2 - а она только одна?
        // 3 - начало и конец не может быть с символа
        // 4 -...

        // метод split - "разрезать" - вернеться массив кусочков String

        String[] partsOfEmail = email.split("@");
        if (partsOfEmail.length == 1) {
            System.out.println("Введенный Email не содержит @ ");
        }
        if (partsOfEmail.length > 2) {
            System.out.println("Введенный Email содержит более 1 символа @");
        }

        String emailArrayBefore = partsOfEmail[0];
        if (emailArrayBefore.isEmpty()) {
            System.out.println("Введен пустой Emeil");
        }

        int simbolsEmailArrayBefore= emailArrayBefore.length();
        if (simbolsEmailArrayBefore>320) {
            System.out.println("Email введен не правильно, привышен лимит символов 320 в имени почтового ящика");
        }

        String emailArrayAfter = partsOfEmail[1];
        if (!emailArrayAfter.contains(".")) {
            System.out.println("Введенный Email не содержит символа \".\"");
        }

        int simbolsDomenName = emailArrayAfter.length();
        if (simbolsDomenName>255){
            System.out.println("Введено неверное доменное имя,привышен лимит сиволов");
        }



    }
}

