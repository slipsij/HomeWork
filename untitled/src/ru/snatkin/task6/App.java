package ru.snatkin.task6;

import java.util.Scanner;

public class App extends Drink{
    public App(int number, String title, double price) {

    }

    public static void main(String[] args) {
        VendMachine menu[] = new VendMachine[9];
        menu[0] = new VendMachine(Drink.VODKA);
        menu[1] = new VendMachine(Drink.MILK_COCONUT);
        menu[2] = new VendMachine(Drink.BrichJuice);
        menu[3] = new VendMachine(Drink.GreenTea);
        menu[4] = new VendMachine(Drink.BlackTea);
        menu[5] = new VendMachine(Drink.SMOOTHIE);

        System.out.println("Выберите напиток");
        for (int i = 0; i <= 3; i++) {
            System.out.println(menu[i] + "   Нажмите кнопку   " + (i+1));
        }

        Scanner scan = new Scanner(System.in);
        int button = scan.nextInt();

        System.out.println("Внесите оплату");

        int pay = scan.nextInt();
        int sum = pay;
        if (button == 1) {
            while (sum < menu[0].Price) {
                pay = scan.nextInt();
                sum = sum + pay;
            }
            System.out.println("Ваш напиток готов");
            if (sum > menu[0].Price)
                System.out.println("Сдача составляет   " + (sum - menu[0].Price));
        }

        if (button == 2) {
            while (sum < menu[1].Price) {
                pay = scan.nextInt();
                sum = sum + pay;
            }
            System.out.println("Ваш напиток готов");
            if (sum > menu[1].Price)
                System.out.println("Сдача составляет   " + (sum - menu[1].Price));
        }
        if (button == 3) {
            while (sum < menu[2].Price) {
                pay = scan.nextInt();
                sum = sum + pay;
            }
            System.out.println("Ваш напиток готов");
            if (sum > menu[2].Price)
                System.out.println("Сдача составляет   " + (sum - menu[2].Price));
        }
        if (button == 4) {
            while (sum < menu[3].Price) {
                pay = scan.nextInt();
                sum = sum + pay;
            }
            System.out.println("Ваш напиток готов");
            if (sum > menu[3].Price)
                System.out.println("Сдача составляет   " + (sum - menu[3].Price));
        }
    }
}
