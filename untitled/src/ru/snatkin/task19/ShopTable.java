package ru.snatkin.task19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ShopTable {
    public static void main(String[] args) {
    try (FileReader fr = new FileReader("product.txt");
         Scanner scanner = new Scanner(fr)) {
         scanner.useLocale(Locale.ENGLISH);

        float d = 0;
        while (scanner.hasNext()) {

    if (scanner.hasNextInt()) {
        int a = scanner.nextInt();
        //System.out.printf("%10s", a);
        d = a;
    } else if (scanner.hasNextFloat()) {
        float b = scanner.nextFloat();
        //System.out.printf("%10s", b);
        d = b;
    } else {
        System.out.println();
        String c = scanner.nextLine();
        //System.out.printf("%-10s", c);
        System.out.println(c);
    } if (d!=0) {
        d = d * d;
    } System.out.println(d);
    d = 0;
}
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
        }
    }
}