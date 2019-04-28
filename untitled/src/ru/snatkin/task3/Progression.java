package ru.snatkin.task3;

public class Progression{

    private int a0;
    private int d;

    Progression(int a0, int d) {
        this.a0 = a0;
        this.d = d;
    }


    public int getNumber(int j) {
        int tmp = a0;
        for (int i = 1; i <= j; i++) {
            tmp += i * d;
        }
        return tmp;
    }


    public int getSum(int n) {
        return (n + 1) * (a0 + getNumber(n)) / 2;
    }
}








