package ru.snatkin.task5;

public class Person {

    public Person(String name, int age, String sex) {
        this.name = name;
        this.Age = age;
        this.Sex = sex;
    }

    Person() {
    }

    private String name;
    private int Age;
    private String Sex;


    public int getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }

    public String getName() {
        return name;
/*
        Katya("Катя",40,"Сопрано","Женщина");
        Fedya("Антон",32,"Тенор","Мужчина");
        Olga("Ольга",8,"Альт","Женщина");
        Ivan("Антон",32,"Тенор","Мужчина");
        Sasha("Антон",20,"Контр тенор","Мужчина");
        Nadya("Надя",19,"Сопрано","Женщина");*/
    }
}
