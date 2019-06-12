package ru.snatkin.task17;

import java.io.*;

public class SerDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир т.1", "Л.Толстой", 1863);
        Book book2 = new Book("Война и мир т.2", "Л.Толстой", 1863);
        Book book3 = new Book("Горе от ума", "Грибоедов", 1820);

        try (OutputStream os = new FileOutputStream("Library.bin");
            ObjectOutputStream oos = new ObjectOutputStream(os);) {
            oos.writeObject(book1);
            oos.writeObject(book2);
            oos.writeObject(book3);
        } catch (IOException e) {
            System.out.println("IO Exception");
        }


        try (InputStream is = new FileInputStream("Library.bin");
             ObjectInputStream ois = new ObjectInputStream(is)) {
            Book book;
            while (is.available() > 0) {
                book = (Book) ois.readObject();
                System.out.println(book);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
