package ru.snatkin.task1;

import java.util.Scanner;

public class GasCost {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество литров и цену за 1л");
        double var1 = sc.nextDouble();

        System.out.println("Введите количество литров и цену за 1л");
        double var2 = sc.nextDouble();
        sc.close();

        System.out.println("Результат " + var1*var2);
}
}
