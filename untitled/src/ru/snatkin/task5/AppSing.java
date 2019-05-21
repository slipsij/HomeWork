package ru.snatkin.task5;

import java.util.Scanner;

public class AppSing {
    public static void main(String[] args) {
        System.out.println("Конструктор хора");
        System.out.println("Выберите дирижера"); // дирижер только тот у кого есть power true
        System.out.println("Выберите хор");// через if else можно выбрать только 1 хор, но привыборе других хоров
                                           // появляется сообщение что они заболели и тд
        System.out.println("Ваш дирижер getname управляет хором getname");
    }
}
