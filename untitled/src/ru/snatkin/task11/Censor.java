package ru.snatkin.task11;

import java.util.Scanner;

public class Censor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String text2 = text.replaceAll("бяка", "вырезано цензурой");
        System.out.println(text2);
}
}
