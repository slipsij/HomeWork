package ru.snatkin.task3;

import java.util.Scanner;

public class Progression{
     public static void main(String[] args) {

         double prog;

         Scanner sc = new Scanner(System.in);
            System.out.println("Введите число членов");
         int A = sc.nextInt();
         System.out.println("Введите разность прогресии");
         int B = sc.nextInt();
             System.out.println("Введите шаг прогресии");
         int C = sc.nextInt();


         prog = A + (B - 1) * C;
             System.out.println("" + prog);
     }
}









