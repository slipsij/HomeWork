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

    public static Meal getMealByTitle(String name){
    Meal[] meals = Meal.values();
        for (int i = 0; i < meals.length; i++) {
           if (meals[i].getTitle().equals(name)){
               return meals[i];
           }
        }
        return null;
    }


}
