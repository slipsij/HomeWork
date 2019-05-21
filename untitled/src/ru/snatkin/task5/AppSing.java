package ru.snatkin.task5;

import java.util.Scanner;

public class AppSing {
    public static void main(String[] args) {
        /*System.out.println("Конструктор хора");
        System.out.println("Выберите дирижера"); // дирижер только тот у кого есть power true
        System.out.println("Выберите хор");// через if else можно выбрать только 1 хор, но привыборе других хоров
                                           // появляется сообщение что они заболели и тд
        System.out.println("Ваш дирижер getname управляет хором getname");*/



        Conductor conductor = new Conductor ("Алексей",23, "Мужчина",true);
        Singer[] singers = new Singer[10];
        singers[0] = new Singer("Катя", 40, "ж", "сопрано");
        singers[1] = new Singer("Оля", 40, "ж", "сопрано");
        singers[2] = new Singer("Женя", 40, "ж", "сопрано");
        singers[3] = new Singer("Антон", 40, "м", "тенор");
        singers[4] = new Singer("Полина", 40, "ж", "сопрано");
        singers[5] = new Singer("Евгения", 40, "ж", "сопрано");
        singers[6] = new Singer("Дада", 40, "ж", "сопрано");
        //заполнение
        Choir choir = new Choir(conductor, singers);

        conductor.hello();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите песню");
        // дирижер заставляет петь хор
        //на вход можно подать абсолютно другой хор с другими певцами
        conductor.poi(choir, scanner.nextLine());
    }
}
