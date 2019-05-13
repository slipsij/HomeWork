package ru.snatkin.task3;

import java.util.Scanner;

public class WhatNumber {
    public static void main(String[] args) {
        System.out.println("Введите число характеристики которго вы желаете узнать ");

        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();

        if (a > 0){
            System.out.println("Положительное ");
            if (a % 2 == 0) {
                System.out.println("Чётное");
            } else {
                System.out.println("Нечётное");
            }
        } else {
            System.out.println("Отрицательное ");
            if (a % 2 == 0) {
                System.out.println("Чётное");
            } else {
                System.out.println("Нечётное");
            }
        }
    }
}








