package ru.snatkin.task6;

import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {
        Drink2[] Liquid = new Drink2[6];
        Liquid[0] = Drink2.OrangeTea;
        Liquid[1] = Drink2.PurpleTea;
        Liquid[2] = Drink2.VODochka;
        Liquid[3] = Drink2.SMOO;
        Liquid[4] = Drink2.MILK_COC;
        Liquid[5] = Drink2.RichJuice;

        // экземпляр класса VendMachine - переменная автомат automat,
        // для создания этой перем вызвали конструктор класса VendMachine с аргументами (т.е. это не конструктор по умолчанию)
        VendMachine automat = new VendMachine(Liquid);

        Drink2[] items = automat.getDrinks();

        System.out.println("Выберите напиток");
        for (int i = 0; i < automat.getDrinks().length; i++) {
            System.out.println(Liquid[i] + "   Нажмите кнопку   " + i);
        }

        Scanner scan = new Scanner(System.in);
        int button = scan.nextInt();

        if (button < 0 || button > items.length){
            System.out.println("Вы ввели некоректное число, введите корректное");
        } else {
            System.out.println("Внесите оплату");
            int pay = scan.nextInt();
            if (pay < items[button].getPrice()){
                System.out.println("Не достаточно средств");
           } else {
                System.out.println("Получите напиток " + items[button].getTitle());
           }
       }
    }
}


