package ru.snatkin.task1;

import java.util.Scanner;

public class SecInHour {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество секунд");
        double sec = sc.nextDouble();
        sc.close();

        int min = 60;
        int hour = 60;

        System.out.println("В 3600 секундах " + (sec/min/hour) + " час");
    }
}
