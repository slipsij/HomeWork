package ru.snatkin.task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFile {

    public static void main(String[] args) throws IOException {

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
        System.out.println(file.getCanonicalPath());



        File dir = new File ("dir/a/b/c");
        dir.mkdirs();

        File file1 = new File("dir/a/b/c/first.txt");
        file1.createNewFile();
        new File("dir/a/b/c/second.txt").createNewFile();
        new File("dir/a/b/first.txt").createNewFile();
        new File("dir/a/first.txt").createNewFile();
        //files copy
        Path src = Paths.get("dir/a/first.txt");
        Path dst = Paths.get("dir/a/new.txt");
        Files.copy(src, dst);



    }
}