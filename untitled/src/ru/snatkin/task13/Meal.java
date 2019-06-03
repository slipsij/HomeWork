package ru.snatkin.task13;
/*
* Объявляем список еды
* */

/**
 * Обычно java-doc пишутся в таком блоке
 * как это делатся:
 * /** enter - idea сама генерит
 */
public enum Meal {
    Mango("Манго"),
    FriedPotato("Жареная Картошка"),
    HotDog("Хот-Дог");

   //поля обычно объявляем с маленькой буквы. title
    private String Title;

    Meal() {
    }

    Meal(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }
}
