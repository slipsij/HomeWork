package ru.snatkin.task1;

import java.util.Scanner;

public class SalaryTax {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму зароботной платы до вычета НДС");
        double var1 = sc.nextDouble();
        sc.close();

        System.out.println("За вычетом НДС вы получите " + var1 * 0.87);
    }
}