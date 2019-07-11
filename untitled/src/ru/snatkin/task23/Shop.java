package ru.snatkin.task23;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static final Logger logger = LoggerFactory.getLogger(Shop.class);

    public static void main(String[] args) {

        // ну мы логером должны собирать инфу, т.е. как я понял мы можем собирать информацию о покупках, что в чеке
        logger.info("Начало работы программы");

        System.out.println("Welcome!");
        System.out.println("Select the desired action.");
        try{ Menu startMenu = new Menu();
        while(startMenu.chooseAction() <= 2) {} }catch (Exception e) {
        logger.error(e.getMessage(), e);
    }
        logger.info("Программа завершена");
    }

    public static List<Product> getProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(ProductType.BREAD, "Brown tommy"));
        productList.add(new Product(ProductType.MILK, "Soy Milk"));
        productList.add(new Product(ProductType.VEGETABLES, "Potato"));
        productList.add(new Product(ProductType.BREAD, "Wheat bread"));
        productList.add(new Product(ProductType.MILK, "Oat Milk"));
        productList.add(new Product(ProductType.VEGETABLES, "Tomato"));
        return productList;
    }
    //это мы типа сделали метод по которому будет рабоать логгер?
    // будем использовать  переменные отсюда в коде
    private static void doSome(String value) {
        logger.info("Вызван метод doSome с параметром <{}> от имени пользователя <{}>",
                value, MDC.get("user"));
        logger.warn("сейчас будет ошибка");
        throw new RuntimeException("Какая-то ошибка");
    }
}


//Это пример с урока куда я смотрел)
/*
*
 * import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Slf4jDemo {
    private static final Logger logger = LoggerFactory.getLogger(Slf4jDemo.class);

    public static void main(String[] args) throws FileNotFoundException {
        logger.info("Начало работы программы");
        String user = authorize();
        MDC.put("user", user);
        try {
            doSome("значение");
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        System.out.println("Пока!");
        logger.info("Программа завершена");
    }

    /**
     * Некоторая логика по авторизации пользователя
     * @return имя пользователя
     */
/*private static String authorize() {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        return user;
        }

private static void doSome(String value) {
        logger.info("Вызван метод doSome с параметром <{}> от имени пользователя <{}>",
        value, MDC.get("user"));
        logger.warn("сейчас будет ошибка");
        throw new RuntimeException("Какая-то ошибка");
        }
        }
 */





