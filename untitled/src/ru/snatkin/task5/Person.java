package ru.snatkin.task5;

public enum Person {
    Anton("Антон",18,"Тенор","Мужчина"),
    Katya("Катя",40,"Сопрано","Женщина"),
    Fedya("Антон",32,"Тенор","Мужчина"),
    Olga("Ольга",8,"Альт","Женщина"),
    Ivan("Антон",32,"Тенор","Мужчина"),
    Sasha("Антон",20,"Контр тенор","Мужчина"),
    Nadya("Надя",19,"Сопрано","Женщина");

    Person(String name, int age, String timbre, String sex) {
        this.name = name;
        Age = age;
        Timbre = timbre;
        Sex = sex;
    }

    private String name;
    private int Age;
    private String Timbre;
    private String Sex;

    public int getAge() {
        return Age;
    }

    public String getTimbre() {
        return Timbre;
    }

   public String getSex() {
        return Sex;
    }

    public String getName() {
        return name;
    }
}
