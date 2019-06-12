package ru.snatkin.task18;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Copy {
    public static void main(String[] args) throws IOException {
        File file = new File("utf8.txt");
        //записали строку в файл
        try (OutputStream os = new FileOutputStream(file)) {
            String s = "Привет мир!";
            os.write(s.getBytes(Charset.forName("UTF8")));
        }
    //читаем строку из файла
    try (InputStream is = new FileInputStream(file)) {
        byte[] buf = new byte[100];
        if (is.read(buf) != -1) {
            String s = new String(buf, StandardCharsets.UTF_8);
            System.out.println(s);
            //записываем строку в другой файл с другой кодировкой
            try (OutputStream os = new FileOutputStream("windows1251.txt")) {
                os.write(s.getBytes(Charset.forName("windows-1251")));
                }
            }
        }
    }
}

