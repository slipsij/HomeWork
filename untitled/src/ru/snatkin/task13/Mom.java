package ru.snatkin.task13;

import java.util.Scanner;

public class Mom {
    public static void main(String[] args) {
        Child someChild = new Child();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите еду: Жареная картошка, Манго, Хот-Дог");

        String eat;
        eat = scan.nextLine();
        Meal a = Meal.getMealByTitle(eat);

        try {
        if (a != null) {
            someChild.toEat(a);
        } else {
            System.out.println("Пользователь ввел не корректные данные null");
        }
       } catch (BadMEalException e) {
        System.out.println("Попробуем другую пищу");
    }
    }
}
