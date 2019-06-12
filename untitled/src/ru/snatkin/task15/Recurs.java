package ru.snatkin.task15;

import java.io.File;
import java.io.IOException;

// реализован обход по каталогам и задание со звезой на глубину иерархии
public class Recurs {
    public static void main(String[] args) {
        File dir = new File("dir");
        try {
            System.out.println(dir.getCanonicalPath());
            recursiveName(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    static String a = " ";
    private static void recursiveName(File dir) throws IOException {

        File[] files = dir.listFiles();
        for (File file : files) {
            if(file.isFile()){
                System.out.println(a + file.getCanonicalPath());
            } else {
                System.out.println(a + file.getCanonicalPath());
                a = a + " ";
                recursiveName(file);
           }
        }
    }
}
