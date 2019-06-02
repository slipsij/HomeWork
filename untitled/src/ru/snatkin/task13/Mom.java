package ru.snatkin.task13;

import java.util.Scanner;

public class Mom {
    public static void main(String[] args) {
        Child someChild = new Child();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите еду: Жареная картошка, Манго, Хот-Дог");

        Meal a = Meal.HotDog;
        String eat;
        boolean b = false;    //тут не понятно что за конструкция
        while (!b) {
            try {
                eat = scan.nextLine();
                a = Meal.valueOf(eat);
                b = true;
            } catch (IllegalArgumentException e) {
                System.out.println("Такой еды нет");
            }
        } try {
            someChild.toEat(a);
        } catch (BadMEalException e) {
            System.out.println("Попробуем другую пищу");
        }
    }
}
