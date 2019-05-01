package ru.snatkin.task6;

import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {
        Drink[] Liquid = new Drink[6];
        Liquid[0] = Drink.BlackTea;
        Liquid[1] = Drink.GreenTea;
        Liquid[2] = Drink.VODKA;
        Liquid[3] = Drink.SMOOTHIE;
        Liquid[4] = Drink.MILK_COCONUT;
        Liquid[5] = Drink.BrichJuice;

        // экземпляр класса VendMachine - переменная автомат automat,
        // для создания этой перем вызвали конструктор класса VendMachine с аргументами (т.е. это не конструктор по умолчанию)
        VendMachine automat = new VendMachine(Liquid);



        Drink[] items = automat.getDrinks();

        System.out.println("Выберите напиток");
        for (int i = 0; i < automat.getDrinks().length; i++){
            System.out.println(Liquid[i] + "   Нажмите кнопку   " + (items[i].Number));
        }

        Scanner scan = new Scanner(System.in);
        int button = scan.nextInt();


        if (button < 1 || button > items.length){
            System.out.println("Вы ввели некоректное число, введите корректное");}

       else {
            System.out.println("Внесите оплату");
            int pay = scan.nextInt();
           if (pay < items[button-1].getPrice()){
               System.out.println("Не достаточно средств");}
           else {
               System.out.println("Получите напиток " + items[button-1].Title);
           }
       }
    }
}


