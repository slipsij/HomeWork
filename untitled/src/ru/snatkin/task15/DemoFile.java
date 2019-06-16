package ru.snatkin.task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFile {

    // TODO: 16.06.2019 psvm, убрада throws, некуда дальше пробросить, ошибку обрабатываем
    public static void main(String[] args) {

        System.out.println(File.separator);

        //создание файла
        File file = new File ("test.txt");
        try {
            file.createNewFile();
            //переименование файла
            file.renameTo(new File(" test2.txt"));

        } catch (IOException e) {
            System.out.println("ошибка создания файла");
        }
        // TODO: 16.06.2019 при вызове данной функции может возникнуть ошибка
        // TODO: 16.06.2019 в psvm мы ее не пробрасываем выше (throws IOException), а обрабатываем
        //System.out.println(file.getCanonicalPath());
        try {
            System.out.println(file.getCanonicalPath());
        } catch (IOException e) {
            System.out.println("При вызове метода getCanonicalPath возникла ошибка");
        }


        File dir = new File ("dir/a/b/c");
        dir.mkdirs();

        File file1 = new File("dir/a/b/c/first.txt");
        try {
            file1.createNewFile();
            new File("dir/a/b/c/second.txt").createNewFile();
            new File("dir/a/b/first.txt").createNewFile();
            new File("dir/a/first.txt").createNewFile();
        } catch (IOException e) {
            // TODO: 16.06.2019 в идеале, эту ошибку записать в файл логов (14 лекция)
            e.printStackTrace();
        }

        //files copy
        Path src = Paths.get("dir/a/first.txt");
        Path dst = Paths.get("dir/a/new.txt");
        try {
            Files.copy(src, dst);
        } catch (IOException e) {
            // TODO: 16.06.2019 в идеале, эту ошибку записать в файл логов (14 лекция)
            e.printStackTrace();
        }
    }
}