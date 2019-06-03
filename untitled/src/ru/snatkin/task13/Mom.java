package ru.snatkin.task13;

import java.util.Scanner;

public class Mom {
    public static void main(String[] args) {
        Child someChild = new Child();

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите еду: Жареная картошка, Манго, Хот-Дог");

        //зачем присвоил хот - дог? из за not initialized ошибку? напиши null
        Meal a = null;
        String eat;
        boolean b = false;    //тут не понятно что за конструкция

        //кажется, идея была в том, чтобы крутиться до тех пор,
        // пока пользовател не ввел какое то String значение

        while (!b) {
            try {
                //к примеру, ввел не строку
                //не смогли сгенерить Meal
                //поши в блок catch
                eat = scan.nextLine();
                a = Meal.valueOf(eat);
                b = true;
            } catch (IllegalArgumentException e) {
                //в sout написали
                //значение b не изменилось
                //снова крутимся в цикле while
                System.out.println("Такой еды нет");
            }
            //кстати, метод может выдавать NullPointerException, если eat == null
            //делаем выводы и обрабатываем данный случай еще одним блоком catch
        }

        // НО. ТЫ ПОПЫТАЛСЯ ЗАПУСТИЬ ПРОГРАММУ? ОНА СТАБИЛЬНО ВЫДАЕТ СТРОКУ
        //ТАКОЙ ЕДЫ НЕТ
        //потому что на вход методу подаешь значение поля Title из Enum
        //а нужно названия перечислений, то есть "Mango" "FriedPotato" "HotDog"
        //почитай тут http://www.quizful.net/post/java_enums

        try {
            someChild.toEat(a);
        } catch (BadMEalException e) {
            System.out.println("Попробуем другую пищу");
        } finally {
            //вот сюда я перенесла блок finally из класса ребенка
            System.out.println("Спасибо мама!");
        }
    }
}
