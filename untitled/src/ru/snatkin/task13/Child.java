package ru.snatkin.task13;

public class Child {
    void toEat(Meal a) throws BadMEalException {
        //здесь не должно быть блока try-catch
        //в таком блоке вызываем методы, которые могут выкинуть ошибку
        //к примеру, данный метод toEat должен быть вызван в блоке
        //потому что он может выбросить exception BadMEalException

        //пример правильного кода
        //try {
            if (a == Meal.Mango || a == Meal.FriedPotato) {
                System.out.println("Съел за обе щеки");
            } else
                throw new BadMEalException();
            }

            //данный блок переносим туда, где будет try-catch. См класс Mom
            /*finally {
            System.out.println("Спасибо мама!");
        }*/
    }