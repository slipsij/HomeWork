package ru.snatkin.task5;

public class Conductor extends Person {

    private boolean Power;

    public boolean isPower() {
        return Power;
    }

    public void setPower(boolean power) {
        Power = power;
    }

    public Conductor(String name, int age, String sex, boolean power) {
        super(name, age, sex);
        Power = power;
    }
}
