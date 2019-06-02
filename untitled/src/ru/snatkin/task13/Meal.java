package ru.snatkin.task13;
/*
* Объявляем список еды
*
* */
public enum Meal {
   Mango("Манго"), FriedPotato("Жареная Картошка"), HotDog("Хот-Дог");

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
