package ru.snatkin.task3;

import java.util.Scanner;

public class FindMInMax {

    private static int minNumberPrint(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Я могу найти минимальное число из двух введенных тобой!");
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        System.out.println("Введите второе число");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Эти числа равны");
        } else {
            System.out.println("Минимальное число " + minNumberPrint(a, b));
        }
    }
}