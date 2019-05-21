package ru.snatkin.task3;

import java.util.Scanner;

public class Progression{
     public static void main(String[] args) {

         /*System.out.println("Введите число членов");
         Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
         int[] numbers = new int[N];
         for (int i = 0; i < N; i++) {
             numbers[i] = i+1;
         }
         int ans = 0;
         for (int i = 0; i < numbers.length; i++) {
             ans += numbers[i];
             System.out.println(ans);
         }*/


         // решение от Айсины
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите первый член");
         int first = scanner.nextInt();
         System.out.println("Введите шаг прогрессии");
         int b = scanner.nextInt();
         System.out.println("Введите количество членов");
         int count = scanner.nextInt();
         int i = 0;
         while (i < count) {
             System.out.println(first);
             first = first + b;
             i++;
         }
     }
}








