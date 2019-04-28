package ru.snatkin.task2;

import java.util.Random;
import java.util.Scanner;

public class HotCold {

    public static void main(String[] args) {

        int UnknownsNub, UserNum;


        Scanner sc = new Scanner(System.in);
        System.out.println("Угадай число от 1 до 100");
        System.out.println("Для завершения программы введите число 888");

        Random random = new Random();
        UnknownsNub = random.nextInt(100);

        int prev = 0;

        do {

            System.out.println("Введи число а я тебе скажу горячо если загаданое число больше ");
            System.out.println("или холодно если загаданое число меньше");

            UserNum = sc.nextInt();

            if (UserNum == 888) break;

            if (UnknownsNub == UserNum){
                System.out.println("Угадано!");
            } else if (Math.abs(prev-UnknownsNub) > Math.abs(UnknownsNub - UserNum)) {
                System.out.println("Холодно");
            } else {
                System.out.println("Горячо");
            }
            prev = UserNum;

        } while (UnknownsNub != UserNum);
        sc.close();
        }
    }
