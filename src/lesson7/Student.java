package lesson7;

public class Student {

// 1 - переменный (поля класса, характиеристики проекта)

    private String name;
    private String surname;
    private int age;

    //2 - Конструкторы (особый метод который,
    // вызывается в момент создания нового обьекта после слова new)

    public Student(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }




    //3 - Методы
    public void setAge(int age) {
        // явный входящий параметр - age (14)
        // неявный входящий параметр - this (student1)
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
