package ru.snatkin.task7;

public class Counter {
    public static void main(String[] args) {
        B someObject = new B();
        B anotherObject = new B();
        B elseObject = new B();
        System.out.println("Создано объектов: " + B.count);
    }
}

class B {
    static int count;
    B() {
    count++;
    }
}

