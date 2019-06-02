package ru.snatkin.task13;

public class Child {
    void toEat(Meal a) throws BadMEalException {
        try {
            if (a == Meal.Mango || a == Meal.FriedPotato){
                System.out.println("Съел за обе щеки");
            } else
                throw new BadMEalException();   //
            } finally {
            System.out.println("Спасибо мама!");
        }
    }
}